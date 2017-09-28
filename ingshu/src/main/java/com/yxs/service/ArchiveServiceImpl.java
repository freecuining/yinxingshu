package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.ArchiveBean;
import com.yxs.dao.ArchiveDao;

@Service
public class ArchiveServiceImpl implements ArchiveService {
    @Autowired
	private ArchiveDao ad;
	
	public List<ArchiveBean> getAllArchive() {
		List<ArchiveBean> l = ad.getAllArchive();
		return l;
	}

	
	public ArchiveBean getKanArchive(Integer archiveId){
		
		return ad.getKanArchive(archiveId);
	}


	
	public ArchiveBean getPupdate(Integer archiveId) {
		
		return ad.getPupdate(archiveId);
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

	
	
}
