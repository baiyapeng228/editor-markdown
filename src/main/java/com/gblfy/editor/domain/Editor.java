package com.gblfy.editor.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author gblfy
 * @Description 文章实体对象
 * @Date 2019/11/19 17:26
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Editor {

    @Id
    @GeneratedValue
    private Integer id;

    private String content;

    private String textContent="";

    /**
     * 创建时间
     */
    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Override
    public String toString() {
        return "Editor{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
