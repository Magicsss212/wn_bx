package com.woniu.woniu_bx.vo;

import lombok.Data;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName ManagerVo
 * @Description TODO
 * @Author 魏才林
 * @Date 2022/8/29 14:49
 * @Version 1.0
 **/
@Data
public class ManagerVo {
    @Min(1)
    @NotNull
    Integer Id;

    @NotEmpty
    String status;
}
