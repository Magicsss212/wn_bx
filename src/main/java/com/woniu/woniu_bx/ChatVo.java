package com.woniu.woniu_bx.vo;

import com.woniu.woniu_bx.pojo.Chat;
import com.woniu.woniu_bx.pojo.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author:GuoHai
 * @program: IntelliJ IDEA
 * @data: 2022/9/1 15:17
 */
@Data
@Component
public class ChatVo {
    private List<Chat> chatList;
    private User sendUser;
    private User acceptUser;
    private Integer pageNum;
}
