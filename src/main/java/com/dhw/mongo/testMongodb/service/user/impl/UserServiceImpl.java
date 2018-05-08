package com.dhw.mongo.testMongodb.repository;

import com.dhw.mongo.testMongodb.bean.User;
import com.dhw.mongo.testMongodb.repository.UserRepository;
import com.dhw.mongo.testMongodb.repository.UserService;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;


/**
 * Created by dhw on 2018/04/18.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addUser(User user) {
        mongoTemplate.save(user);
    }
    @Override
    public User findByName(String name) {
        return this.userRepository.findByName(name);
    }

    @Override
    public List<User> getUserListByQueryName(String queryName) {
        /*//完全匹配
        Pattern pattern = Pattern.compile("^hzb$", Pattern.CASE_INSENSITIVE);
        //右匹配
                Pattern pattern = Pattern.compile("^.*hzb$", Pattern.CASE_INSENSITIVE);
        //左匹配
                Pattern pattern = Pattern.compile("^hzb.*$", Pattern.CASE_INSENSITIVE);*/
        if(StringUtils.isBlank(queryName)){
            return mongoTemplate.findAll(User.class);
        }else {
            //模糊匹配
            Pattern pattern = Pattern.compile("^.*" + queryName + ".*$", Pattern.CASE_INSENSITIVE);
            Query query = new Query(Criteria.where("name").regex(pattern));
            return mongoTemplate.find(query, User.class);
        }
    }

    @Override
    public Long updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("name",user.getName()).set("age",user.getAge());
        //更新查询返回结果集的第一条
        UpdateResult rtn = mongoTemplate.updateFirst(query,update,User.class);
        //更新查询返回结果集的所有
        //mongoTemplate.updateMulti(query,update,User.class);
        return rtn.getModifiedCount();
    }

    @Override
    public Long deleteUserById(Integer id) {
        Query query = new Query(Criteria.where("id").is(id));
        DeleteResult result = mongoTemplate.remove(query,User.class);
        return result.getDeletedCount();
    }
}
