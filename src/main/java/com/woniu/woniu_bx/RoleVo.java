package com.woniu.woniu_bx.vo;

import com.woniu.woniu_bx.pojo.Role;
import lombok.Data;

import java.util.List;

/**
 * @author:GuoHai
 * @program: IntelliJ IDEA
 * @data: 2022/8/29 16:07
 */
@Data
public class RoleVo {
    private Role role;
    private Integer[] permsId;
    private Integer[] menusId;
}
