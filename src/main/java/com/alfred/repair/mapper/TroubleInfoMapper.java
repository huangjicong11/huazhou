package com.alfred.repair.mapper;


import com.alfred.repair.domain.TroubleInfo;

import java.util.List;

public interface TroubleInfoMapper {
    int deleteByPrimaryKey(String checkid);

    int insert(TroubleInfo record);

    int insertSelective(TroubleInfo record);

    TroubleInfo selectByPrimaryKey(String checkid);

    int updateByPrimaryKeySelective(TroubleInfo record);

    int updateByPrimaryKey(TroubleInfo record);


    //查询
    List<TroubleInfo> queryAllCheck(TroubleInfo check);
}