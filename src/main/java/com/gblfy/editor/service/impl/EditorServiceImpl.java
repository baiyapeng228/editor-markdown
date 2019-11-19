package com.gblfy.editor.service.impl;

import com.gblfy.editor.entity.Editor;
import com.gblfy.editor.mapper.EditorMapper;
import com.gblfy.editor.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gblfy
 * @Description 增删改查通用BaseMapper
 * @Date 2019/11/19 17:26
 */
@Service
public class EditorServiceImpl implements EditorService {

    @Autowired
    private EditorMapper editorMapper;


    @Override
    public void save(Editor editor) {
        editorMapper.insert(editor);
    }

    @Override
    public Editor findOne(int id) {
        return editorMapper.selectById(id);
    }
}
