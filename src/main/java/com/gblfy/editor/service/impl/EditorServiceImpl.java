package com.gblfy.editor.service.impl;

import com.gblfy.editor.domain.Editor;
import com.gblfy.editor.repository.EditorRepository;
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
    private EditorRepository repository;


    @Override
    public void save(Editor editor) {
        repository.save(editor);
    }

    @Override
    public Editor findOne(int id) {
        return repository.findOne(id);
    }
}
