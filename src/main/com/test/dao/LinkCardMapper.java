package com.test.dao;

import com.test.model.LinkCard;

public interface LinkCardMapper {

    int deleteByPrimaryKey(Long id);

    int insert(LinkCard record);

    int insertSelective(LinkCard record);

    LinkCard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LinkCard record);

    int updateByPrimaryKey(LinkCard record);
}