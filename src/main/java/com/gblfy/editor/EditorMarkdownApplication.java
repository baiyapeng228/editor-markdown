package com.gblfy.editor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 启动入口
 */
@SpringBootApplication
@MapperScan("com.gblfy.editor.mapper")
public class EditorMarkdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(EditorMarkdownApplication.class, args);
	}
}
