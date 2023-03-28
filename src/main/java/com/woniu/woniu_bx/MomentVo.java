package com.woniu.woniu_bx.vo;

import com.woniu.woniu_bx.pojo.Moment;
import com.woniu.woniu_bx.pojo.User;
import lombok.Data;

import java.util.List;

/**
 * 用户动态
 *
 * @author sjy
 * @create 2022-09-09 10:49
 */
@Data
public class MomentVo {
    private List<Moment> moments;
    private User user;
}
