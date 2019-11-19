package com.gblfy.editor.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author gblfy
 * @Description 文章实体对象
 * @Date 2019/11/19 17:26
 */
@Data
@TableName("editor")
public class Editor {

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Integer id;
    private String content;
    private String textContent="";
    private Date createTime;
    @Override
    public String toString() {
        return "Editor{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
