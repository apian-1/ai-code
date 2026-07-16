package com.xigua.xiguaaicode.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xigua.xiguaaicode.model.dto.user.UserQueryRequest;
import com.xigua.xiguaaicode.model.entity.User;
import com.xigua.xiguaaicode.model.vo.LoginUserVO;
import com.xigua.xiguaaicode.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * 用户 服务层。
 *
 * @author <a href="https://github.com/apian-1">程序员西瓜</a>
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取脱敏后的用户信息
     *
     * @param user 用户信息
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏后的用户信息(分页)
     *
     * @param userList 用户列表
     * @return
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 根据查询条件构造数据查询参数
     * @param userQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 加密
     *
     * @param userPassword 用户密码
     * @return  返回用户加密后的密码
     */
    String getEncryptPassword(String userPassword);
}
