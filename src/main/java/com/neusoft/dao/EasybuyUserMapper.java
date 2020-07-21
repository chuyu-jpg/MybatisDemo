package com.neusoft.dao;

import com.neusoft.entity.EasybuyUser;

public interface EasybuyUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EasybuyUser record);

    int insertSelective(EasybuyUser record);

    EasybuyUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EasybuyUser record);

    int updateByPrimaryKey(EasybuyUser record);
}