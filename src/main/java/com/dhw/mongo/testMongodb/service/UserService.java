package com.dhw.mongo.testMongodb.service;

import com.dhw.mongo.testMongodb.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dhw
 * @version V1.0
 * @description 描述
 * @ClassName: UserService
 * @Date 2018/4/18
 */
@Repository
public interface UserService {
    /**
     *
     * @description 添加
     * @param
     * @return    返回类型
     * @author dhw
     * @date 2018-04-18 14:04:42
     */
    public void addUser(User user);
    /**
     *
     * @description 根据name查询用户
     * @param
     * @return    返回类型
     * @author 段华微
     * @date 2018-04-18 14:05:22
     */
    public User findByName(String name);
    /**
     *
     * @description 模糊查询用户列表
     * @param
     * @return    返回类型
     * @author 段华微
     * @date 2018-04-18 14:06:31
     */
    public List<User> getUserListByQueryName(String queryName);
    /**
     *
     * @description 更新用户
     * @param
     * @return    返回类型
     * @author 段华微
     * @date 2018-04-18 14:07:41
     */
    public Long updateUser(User user);
    /**
     *
     * @description 根据id删除用户
     * @param
     * @return    返回类型
     * @author 段华微
     * @date 2018-04-18 14:08:28
     */
    public Long deleteUserById(Integer id);

}
