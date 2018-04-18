package com.dhw.mongo.testMongodb.controller;

import com.dhw.mongo.testMongodb.bean.User;
import com.dhw.mongo.testMongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dhw
 * @version V1.0
 * @description 描述
 * @ClassName: Cotroller
 * @Date 2018/4/18
 */
@RestController
public class Cotroller {
    @Autowired
    private UserService userService;


    @GetMapping("/addUser")
    public User sava(Integer id,String name,Integer age){
        User user = new User(id,name,age);
        userService.addUser(user);
        return user;
    }
    @GetMapping("/find")
    public List<User> find() {
        List<User> userList = userService.getUserListByQueryName(null);
        return userList;
    }

    /**
     * input String name "Tseng"
     * @param name
     * @return
     */
    @GetMapping("/findByName")
    public List<User> findByName(@RequestParam("name") String name) {
        List<User> list = userService.getUserListByQueryName(name);
        return list;
    }

    @RequestMapping("/updateUser")
    public String updateUser(Integer id,String name,Integer age){
        User user = new User(id,name,age);
        Long rtn = userService.updateUser(user);
        //rtn如果大于0则修改成功否则失败
        if (rtn.compareTo(0L) > 0){
            return "success";
        }else {
            return "failed";
        }
    }

    @RequestMapping("/deleteUser")
    public String deleteUserById(Integer id){
        Long rtn = userService.deleteUserById(id);
        //rtn如果大于0则删除成功否则失败
        if (rtn.compareTo(0L) > 0){
            return "success";
        }else {
            return "failed";
        }
    }
}
