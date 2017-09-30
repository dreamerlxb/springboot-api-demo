package com.lxb.demo.auth;

import com.lxb.demo.user.User;

public interface AuthService {
	/**
	 * 注册用户
	 * @param userToAdd
	 * @return
	 */
    User register(User userToAdd);
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);
    /**
     * 刷新token
     * @param oldToken
     * @return
     */
    String refresh(String oldToken);
}