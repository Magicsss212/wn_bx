package com.woniu.woniu_bx.vo;

import com.woniu.woniu_bx.pojo.Goods;
import com.woniu.woniu_bx.pojo.Order;
import lombok.Data;

/**
 * @Auther: Ayang
 * @Date: 2022/8/29 14:19
 * @Description:
 */
@Data
public class GoodsVo {
    private Goods goods;
    private Integer pageNum;
    private Integer userId;
    private boolean careUser;
}
