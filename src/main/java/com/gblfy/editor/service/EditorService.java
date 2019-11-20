package com.gblfy.editor.service;

import com.gblfy.editor.entity.Editor;

/**
 * @author gblfy
 * @Description 接口服务
 * @Date 2019/11/19 17:26
 */
public interface EditorService {

    //存储博文对象
    void save(Editor editor);
    //根据存储业务主键id查询,返回博文实体
    Editor findOne(long id);
}
