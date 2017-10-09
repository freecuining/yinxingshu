package com.yxs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yxs.bean.ArchiveBean;

@Repository
public interface ArchiveDao {
    /**
     * 查询档案信息且展现列表
     * @return
     */
	public List<ArchiveBean> getAllArchive(@Param("archiveName")String name);

	/**
	 * 查看档案信息
	 */
	public ArchiveBean getArchiveById(Integer archiveId);

	
	
	/**
	 * 崔宁
	 * 查询档案中无账号的用户信息
	 * @return
	 */
	public List<ArchiveBean> getArchiveNotUser();
}
