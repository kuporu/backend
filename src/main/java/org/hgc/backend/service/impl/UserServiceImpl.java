package org.hgc.backend.service.impl;

import org.hgc.backend.model.param.User;
import org.hgc.backend.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String addUser(User user) {
//        if (user == null || user.getId() == null || user.getAccount() == null || user.getPassword() == null || user.getEmail() == null) {
//            return "对象或者对象字段不能为空";
//        }
//        if (!StringUtils.hasText(user.getAccount()) || !StringUtils.hasText(user.getPassword()) || !StringUtils.hasText(user.getEmail())) {
//            return "不能输入空字符串";
//        }
//        if (user.getAccount().length() < 6 || user.getAccount().length() > 11) {
//            return "账号长度必须是6-11个字符";
//        }
//        if (user.getPassword().length() < 6 || user.getPassword().length() > 16) {
//            return "密码长度必须是6-16个字符";
//        }
//        if (!Pattern.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", user.getEmail())) {
//            return "邮箱格式不正确";
//        }
        // 参数校验完毕后这里就写上业务逻辑
        return "success";
    }
}
