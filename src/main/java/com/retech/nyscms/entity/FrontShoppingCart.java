package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_shopping_cart
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontShoppingCart implements Serializable {
    /**
     * 主键
     * Column:    shoppingCartID
     * Nullable:  false
     */
    private Integer shoppingcartid;

    /**
     * 书籍Id
     * Column:    eBookID
     * Nullable:  false
     */
    private Integer ebookid;

    /**
     * 用户Id
     * Column:    userID
     * Nullable:  false
     */
    private Integer userid;

    /**
     * 当前商品是否下单：0： 未添加到订单 1：已经添加到订单
     * Column:    buyStatus
     * Nullable:  false
     */
    private Integer buystatus;

    /**
     * 购买数量
     * Column:    quantity
     * Nullable:  true
     */
    private Integer quantity;

    /**
     * Column:    createdTime
     * Nullable:  false
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;
}