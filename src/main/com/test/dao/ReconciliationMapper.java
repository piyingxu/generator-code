package com.test.dao;

import com.test.model.Reconciliation;

public interface ReconciliationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Reconciliation record);

    int insertSelective(Reconciliation record);

    Reconciliation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Reconciliation record);

    int updateByPrimaryKey(Reconciliation record);
}