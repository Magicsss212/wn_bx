package com.woniu.woniu_bx.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.woniu.woniu_bx.pojo.Goods;
import com.woniu.woniu_bx.pojo.Order;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author sjy
 * @create 2022-08-29 17:50
 */
@Setter
@Getter
public class OrderDetailsVo {
    private Order order;
    private Goods goods;
}
