package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LengYouNuan
 * @create 2021-02-27 下午9:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommentResult(Integer code, String message) {
        this(code, message, null);
    }
}
