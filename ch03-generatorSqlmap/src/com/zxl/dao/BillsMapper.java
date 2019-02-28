package com.zxl.dao;

import com.zxl.entity.Bills;
import com.zxl.entity.BillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BillsMapper {
    int countByExample(BillsExample example);

    int deleteByExample(BillsExample example);

    int deleteByPrimaryKey(Integer billid);

    int insert(Bills record);

    int insertSelective(Bills record);

    List<Bills> selectByExampleWithRowbounds(BillsExample example, RowBounds rowBounds);

    List<Bills> selectByExample(BillsExample example);

    Bills selectByPrimaryKey(Integer billid);

    int updateByExampleSelective(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByExample(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);
}