package com.alfred.repair.mapper;

import com.alfred.bus.domain.Customer;

import java.util.List;

public interface PartsInfoMapper {
    int deleteByPrimaryKey(String identity);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String identity);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);


    /**
     * 查询
     * @param customer
     * @return
     */
    List<Customer> queryAllCustomer(Customer customer);
}