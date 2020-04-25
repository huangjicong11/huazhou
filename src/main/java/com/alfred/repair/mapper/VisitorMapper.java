package com.alfred.repair.mapper;


import com.alfred.repair.domain.Visitor;

import java.util.List;

public interface VisitorMapper {
    int deleteByPrimaryKey(String identity);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Visitor selectByPrimaryKey(String identity);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);


    /**
     * 查询
     * @param customer
     * @return
     */
    List<Visitor> queryAllCustomer(Visitor visitor);
}