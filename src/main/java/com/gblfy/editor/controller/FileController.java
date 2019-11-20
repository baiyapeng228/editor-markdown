package com.gblfy.editor.controller;

import com.gblfy.editor.dto.FileInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;


/**
 * @author gblfy
 * @Description 图片上传下载管理
 * @Date 2019/11/19 17:26
 */
@RestController
@RequestMapping("/file")
@Slf4j
public class FileController {

    /**
     * 在配置文件中配置的文件保存路径
     */
    @Value("${img.location}")
    private String folder;

    /**
     * 上传图片至指定图片静态目录
     *
     * @param request
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping
    public FileInfo upload(HttpServletRequest request, @RequestParam(value = "editormd-image-file", required = false) MultipartFile file) throws Exception {
        log.info("【FileController】 fileName={},fileOrginNmae={},fileSize={}", file.getName(), file.getOriginalFilename(), file.getSize());
        log.info(request.getContextPath());
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        String newFileName = new Date().getTime() + "." + suffix;

        File localFile = new File(folder, newFileName);
        file.transferTo(localFile);
        log.info(localFile.getAbsolutePath());
        return new FileInfo(1, "上传成功", request.getRequestURL().substring(0, request.getRequestURL().lastIndexOf("/")) + "/upload/" + newFileName);
    }

    @GetMapping("/{id}")
    public void downLoad(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) {
        try (InputStream inputStream = new FileInputStream(new File(folder, id + ".txt"));
             OutputStream outputStream = response.getOutputStream();) {
            response.setContentType("application/x-download");
            response.setHeader("Content-Disposition", "attachment;filename=test.txt");

            IOUtils.copy(inputStream, outputStream);
            outputStream.flush();
        } catch (Exception e) {

        }
    }

    /**
     * 测试存储路径目录
     */
//    public static void main(String[] args) {
//        String folder = System.getProperty("user.dir") + File.separator + "upload" + File.separator;
//        System.out.println("3333" + folder);
//    }
}
