package com.dhw.mongo.testMongodb.repository;

import com.dhw.mongo.testMongodb.bean.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dhw
 * @version V1.0
 * @description 描述
 * @ClassName: UserRepository
 * @Date 2018/4/18
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
}
