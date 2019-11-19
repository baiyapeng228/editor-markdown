package com.gblfy.editor.repository;

import com.gblfy.editor.domain.Editor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gblfy
 * @Description 增删改查通用BaseMapper
 * @Date 2019/11/19 17:26
 */
public interface EditorRepository extends JpaRepository<Editor, Integer> {
}
