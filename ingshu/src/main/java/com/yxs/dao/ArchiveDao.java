package com.yxs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yxs.bean.ArchiveBean;

@Repository
public interface ArchiveDao {
    /**
     * 查询档案信息且展现列表
     * @return
     */
	public List<ArchiveBean> getAllArchive();

	/**
	 * 查看档案信息
	 */
	public ArchiveBean getKanArchive(Integer archiveId);

	/**
	 * 变更前的查询
	 * 
	 **/
	public ArchiveBean getPupdate(Integer archiveId);
	
	/**
	 * 崔宁
	 * 查询档案中无账号的用户信息
	 * @return
	 */
	public List<ArchiveBean> getArchiveNotUser();
}
