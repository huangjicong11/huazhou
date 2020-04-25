package com.alfred.repair.mapper;


import com.alfred.repair.domain.PersonalInfo;

import java.util.List;

public interface PersonalInfoMapper {
    int deleteByPrimaryKey(String rentid);

    int insert(PersonalInfo record);

    int insertSelective(PersonalInfo record);

    PersonalInfo selectByPrimaryKey(String rentid);

    int updateByPrimaryKeySelective(PersonalInfo record);

    int updateByPrimaryKey(PersonalInfo record);

    /**
     * @return 查询
     */
    List<PersonalInfo> queryAllRent(PersonalInfo rent);
}