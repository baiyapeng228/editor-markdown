package com.gblfy.editor.domain;

import lombok.Data;

/**
 * @author gblfy
 * @Description 返回前台结果集封装类
 * @Date 2019/11/19 17:26
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;

    private T data;
}
