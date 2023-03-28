package com.woniu.woniu_bx.vo;

import com.woniu.woniu_bx.pojo.User;
import lombok.Data;

import java.util.List;

/**
 * @author : 王泰元
 * @className: UserVo
 * @description: TODO
 * @date : 2022/8/29 12:33
 */
@Data
public class UserVo {
    private User user;
    private Integer pageNum;

    // 新密码
    private String newPwd;


    // 图片url集合
    private List<String> imgList;

    // 关注人id
    private Integer careId;

    // 验证码
    private String captcha;
}
