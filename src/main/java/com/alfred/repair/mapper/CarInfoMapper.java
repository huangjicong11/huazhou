package com.alfred.repair.mapper;

import com.alfred.bus.domain.Car;
import com.alfred.bus.vo.CarVo;
import com.alfred.repair.domain.CarInfo;

import java.util.List;

public interface CarInfoMapper {
    int deleteByPrimaryKey(String carnumber);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    Car selectByPrimaryKey(String carnumber);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);

    List<Car> queryAllCar(CarVo carVo);
}