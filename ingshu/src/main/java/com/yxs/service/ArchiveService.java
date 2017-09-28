package com.yxs.service;

import java.util.List;

import com.yxs.bean.ArchiveBean;


public interface ArchiveService {

     public List<ArchiveBean> getAllArchive();
     
     public ArchiveBean getKanArchive(Integer archiveId);
     
     public ArchiveBean getPupdate(Integer archiveId);
     
     
     
     /**
 	 * 崔宁
 	 * 查询档案中无账号的用户信息
 	 * @return
 	 */
 	public List<ArchiveBean> getArchiveNotUser();
}
