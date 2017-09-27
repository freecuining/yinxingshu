package com.yxs.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yxs.bean.TrainBean;

@Repository
public interface TrainDao {
      public void  insertAin(TrainBean ain);
      public void  deleteAin(int traId);
      public void  updateAin(TrainBean ain);
      
      public  TrainBean  queryAinById(int trainId);
      public List<TrainBean>  queryAinTraState();
      public List<TrainBean>  queryAinTraResult();
      public List<TrainBean>  queryFy(Map map);
      public List<TrainBean>  queryFy2(Map map);
      public List<TrainBean>  queryFy3(Map map);
      public List<TrainBean>  queryAinAll();
   }
