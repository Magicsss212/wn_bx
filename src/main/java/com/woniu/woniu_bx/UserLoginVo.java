package com.woniu.woniu_bx.vo;

import lombok.Data;

/**
 * @author : 王泰元
 * @className: UserLoginVo
 * @description: TODO
 * @date : 2022/9/7 15:35
 */
@Data
public class UserLoginVo {
    private String telephone;
    private String captcha;
    private String password;
}
