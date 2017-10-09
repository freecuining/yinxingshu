package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.ArchiveBean;


public interface ArchiveService {
	

	/**
	 * 查询所有档案
	 * @return  档案list
	 */
     public PageInfo<Object> getAllArchive(String pageNum,String name);
     
     /**
      * 通过Id查询档案
      * 
      */
     public ArchiveBean getArchiveById(int archiveId);
     
     /**
 	 * 崔宁
 	 * 查询档案中无账号的用户信息
 	 * @return
 	 */
 	public List<ArchiveBean> getArchiveNotUser();
}
