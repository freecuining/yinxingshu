package com.yxs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yxs.bean.TrainBean;
import com.yxs.dao.TrainDao;
@Service
@Transactional
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainDao traindao;
    
    public TrainDao getTrainDao(){
    	return traindao;
    }
    public void setTrainDao(){
    	this.traindao = traindao;
    }
	public void insertAin(TrainBean ain) {
		// TODO Auto-generated method stub
            traindao.insertAin(ain);
	}

	
	public void deleteAin(int traId) {
		// TODO Auto-generated method stub
           TrainBean train = traindao.queryAinById(traId);
           traindao.updateAin(train);
	}

	
	public void updateAin(TrainBean ain) {
		// TODO Auto-generated method stub
             traindao.updateAin(ain);
	}


	public TrainBean queryAinById(int traId) {
		// TODO Auto-generated method stub
		return traindao.queryAinById(traId);
	}


	public List<TrainBean> queryAinTraState() {
		// TODO Auto-generated method stub
		return traindao.queryAinTraState();
	}


	public List<TrainBean> queryAinTraResult() {
		// TODO Auto-generated method stub
		return traindao.queryAinTraResult();
	}


	public List<TrainBean> queryFY(Map map) {
		// TODO Auto-generated method stub
		return traindao.queryFy(map);
	}

	public List<TrainBean> queryFY2(Map map) {
		// TODO Auto-generated method stub
		return traindao.queryFy2(map);
	}


	public List<TrainBean> queryFY3(Map map) {
		// TODO Auto-generated method stub
		return traindao.queryFy3(map);
	}


	public List<TrainBean> queryAinAll() {
		// TODO Auto-generated method stub
		return traindao.queryAinAll();
	}

}
