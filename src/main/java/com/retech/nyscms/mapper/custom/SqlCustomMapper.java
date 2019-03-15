package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.FrontReadHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface SqlCustomMapper {

    int createNewTable(@Param("sql") String sql);

    int alterTable(@Param("sql") String sql);

    int dropTable(@Param("tableName") String tableName);

    List<String> showColumns(String tableName);

    int getResCount(@Param("sql") String sql);

    List<Map<String, Object>> getResList(@Param("sql") String sql);

    void insertUserMsgs(@Param("sql") String sql);

    float sumMoneyByUserAndTime(@Param("userid")Integer userid,@Param("month")String month);

    int sumScoreByUserAndTime(@Param("userid")Integer userid,@Param("month")String month);

    int countByUserAndTime(@Param("userid")Integer userid,@Param("month")String month);

}
