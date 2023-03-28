package com.woniu.woniu_bx.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 排序专用请求
 *
 * @author sjy
 * @create 2022-09-02 18:41
 */
@Data
@Component
public class GoodsSortVo {
    int id;
    int value1;
    int value2;
    int value3;
}
