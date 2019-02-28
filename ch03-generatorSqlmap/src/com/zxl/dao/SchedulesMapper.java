package com.zxl.dao;

import com.zxl.entity.Schedules;
import com.zxl.entity.SchedulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SchedulesMapper {
    int countByExample(SchedulesExample example);

    int deleteByExample(SchedulesExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(Schedules record);

    int insertSelective(Schedules record);

    List<Schedules> selectByExampleWithRowbounds(SchedulesExample example, RowBounds rowBounds);

    List<Schedules> selectByExample(SchedulesExample example);

    Schedules selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") Schedules record, @Param("example") SchedulesExample example);

    int updateByExample(@Param("record") Schedules record, @Param("example") SchedulesExample example);

    int updateByPrimaryKeySelective(Schedules record);

    int updateByPrimaryKey(Schedules record);
}