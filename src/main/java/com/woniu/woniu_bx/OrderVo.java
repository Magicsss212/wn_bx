package com.woniu.woniu_bx.vo;

import com.woniu.woniu_bx.pojo.Order;
import lombok.Data;

import java.util.List;

/**
 * @author sjy
 * @create 2022-08-29 12:22
 */
@Data
public class OrderVo {
    private Order order ;
    private Integer page;
    private Integer userId;
    private List<String> status;
}
