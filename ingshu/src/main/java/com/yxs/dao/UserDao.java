package com.yxs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yxs.bean.UserBean;

@Repository
public interface UserDao {

	public UserBean login(@Param("loginName") String loginName, @Param("password") String password);

	public void updateLoginNum(int userId);

	
}
