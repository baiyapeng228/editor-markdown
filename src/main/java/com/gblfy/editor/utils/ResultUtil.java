package com.gblfy.editor.utils;


import com.gblfy.editor.domain.Result;

/**
 * @author gblfy
 * @Description 响应结果状态封装类
 * @Date 2019/11/19 17:26
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
