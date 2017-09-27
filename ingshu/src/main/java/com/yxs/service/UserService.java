package com.yxs.service;


import com.github.pagehelper.PageInfo;
import com.yxs.bean.UserBean;


public interface UserService {

	PageInfo list(int pageNum, int i, int j);

	
}
