package com.yxs.service;

import java.util.List;
import java.util.Map;

import com.yxs.bean.TrainBean;

public interface TrainService {
   public void insertAin(TrainBean ain);
   public void deleteAin(int traId);
   public void updateAin(TrainBean ain);
   
   public TrainBean queryAinById(int traId);
   public List<TrainBean>  queryAinTraState();
   public List<TrainBean>  queryAinTraResult();
   public List<TrainBean> queryFY(Map map);
   public List<TrainBean> queryFY2(Map map);
   public List<TrainBean> queryFY3(Map map);
   public List<TrainBean> queryAinAll();
}
