package org.hgc.backend.model.param;

import lombok.Data;
import org.hgc.backend.valid.AddGroup;
import org.hgc.backend.valid.ListValue;
import org.hgc.backend.valid.UpdateGroup;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;


@Data
public class User {

    /**
     * id
     */
    @Null(message = "新增状态下，id为空", groups = {AddGroup.class})
    @NotNull(message = "修改状态下，id不为空", groups = {UpdateGroup.class})
    @ListValue(value = {1,2,3}, groups = {UpdateGroup.class})
    private Integer id;

    /**
     * 用户账号
     */
    @NotNull(message = "新增状态下，用户账号不能为空", groups = {AddGroup.class})
    @Size(min = 6, max = 11, message = "账号长度必须是6-11个字符", groups = {AddGroup.class, UpdateGroup.class})
    private String account;

    /**
     * 密码
     */
    @NotNull(message = "新增状态下，用户密码不能为空", groups = {AddGroup.class})
    @Size(min = 6, max = 11, message = "密码长度必须是6-16个字符", groups = {AddGroup.class, UpdateGroup.class})
    private String password;

    /**
     * 邮箱
     */
    @NotNull(message = "新增状态下，用户邮箱不能为空", groups = {AddGroup.class})
    @Email(message = "邮箱格式不正确", groups = {AddGroup.class, UpdateGroup.class})
    private String email;
}