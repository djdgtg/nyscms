package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontFriend;
import com.retech.nyscms.entity.FrontFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontFriendMapper {
    int countByExample(FrontFriendExample example);

    int deleteByExample(FrontFriendExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontFriend record);

    int insertSelective(FrontFriend record);

    List<FrontFriend> selectByExample(FrontFriendExample example);

    FrontFriend selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontFriend record, @Param("example") FrontFriendExample example);

    int updateByExample(@Param("record") FrontFriend record, @Param("example") FrontFriendExample example);

    int updateByPrimaryKeySelective(FrontFriend record);

    int updateByPrimaryKey(FrontFriend record);
}