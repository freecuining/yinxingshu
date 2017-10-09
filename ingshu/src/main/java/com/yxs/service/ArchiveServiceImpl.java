package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.ArchiveBean;
import com.yxs.dao.ArchiveDao;
import com.yxs.util.State;

@Service
public class ArchiveServiceImpl implements ArchiveService {
    @Autowired
	private ArchiveDao ad;
	
	public PageInfo<Object> getAllArchive(String pageNum ,String name) {
		PageHelper.startPage(Integer.parseInt(pageNum), State.PAGESIZE);
		List<ArchiveBean> l = ad.getAllArchive(name);
		PageInfo<Object> info = new PageInfo(l, State.PAGECOUNT);
		
		return info;
	}

	/**
	 * 崔宁
	 * 查询档案中无账号的用户信息
	 * @return
	 */
	public List<ArchiveBean> getArchiveNotUser() {
		// TODO Auto-generated method stub
		return ad.getArchiveNotUser();
	}

	/**
	 * 通过 id查档案
	 * 
	 */
	@Transactional
	public ArchiveBean getArchiveById(int archiveId) {
		// TODO Auto-generated method stub
		return ad.getArchiveById(archiveId);
	}

	
	
}
