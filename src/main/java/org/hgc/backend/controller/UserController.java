package org.hgc.backend.controller;

import org.hgc.backend.model.param.User;
import org.hgc.backend.model.vo.ResultVO;
import org.hgc.backend.service.UserService;
import org.hgc.backend.valid.AddGroup;
import org.hgc.backend.valid.UpdateGroup;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 添加用户
     * @param user 用户
     * @return
     */
    @PostMapping("/addUser")
    public String addUser (@RequestBody @Validated({AddGroup.class}) User user) {
        return userService.addUser(user);
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @PostMapping("/updateUser")
    public String updateUser (@RequestBody @Validated({UpdateGroup.class}) User user) {
        return userService.updateUser(user);
    }

    /**
     * 查询用户
     * @return
     */
    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");

        return user;
    }
}
