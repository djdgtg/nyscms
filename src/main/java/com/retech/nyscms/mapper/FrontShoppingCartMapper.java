package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontShoppingCart;
import com.retech.nyscms.entity.FrontShoppingCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontShoppingCartMapper {
    int countByExample(FrontShoppingCartExample example);

    int deleteByExample(FrontShoppingCartExample example);

    int deleteByPrimaryKey(Integer shoppingcartid);

    int insert(FrontShoppingCart record);

    int insertSelective(FrontShoppingCart record);

    List<FrontShoppingCart> selectByExample(FrontShoppingCartExample example);

    FrontShoppingCart selectByPrimaryKey(Integer shoppingcartid);

    int updateByExampleSelective(@Param("record") FrontShoppingCart record, @Param("example") FrontShoppingCartExample example);

    int updateByExample(@Param("record") FrontShoppingCart record, @Param("example") FrontShoppingCartExample example);

    int updateByPrimaryKeySelective(FrontShoppingCart record);

    int updateByPrimaryKey(FrontShoppingCart record);
}