package com.tz.leo.springboot.controller;


import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Author: tz_wl
 * Date: 2020/7/13 0:10
 * Content:
 */

@Controller
@RequestMapping("file")
public class FileController {

    @RequestMapping("download")
    public void download(String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String realPath = request.getServletContext().getRealPath("/download");
        FileInputStream fileInputStream = new FileInputStream(new File(realPath, fileName));

        //设置下载相应头                                    attachment| inline
        response.setHeader("content-disposition","inline;fileName="+ URLEncoder.encode(fileName,"UTF-8"));


        ServletOutputStream outputStream = response.getOutputStream();
        IOUtils.copy(fileInputStream,outputStream);
        IOUtils.closeQuietly(fileInputStream);
        IOUtils.closeQuietly(outputStream);
    }

    @RequestMapping("upload")
    public String upload(MultipartFile aaa , HttpServletRequest request) throws IOException {
        System.out.println("文件名: "+aaa.getOriginalFilename());

        System.out.println("文件类型: "+aaa.getContentType());

        System.out.println("文件大小: "+aaa.getSize());
        //根据相对获取绝对路径
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        //创建时间文件夹
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        File file = new File(realPath, format);
        if(!file.exists()) file.mkdirs();
        //获取文件后缀
        String extension = FilenameUtils.getExtension(aaa.getOriginalFilename());

        //根据文件后缀动态获取文件类型

        String mimeType = request.getSession().getServletContext().getMimeType("."+extension);
        System.out.println("动态根据后缀获取文件类型: "+mimeType);

        String newFileNamePrefix = UUID.randomUUID().toString().replace("-","")+
                new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        String newFileName = newFileNamePrefix+"."+extension;
        //处理上传操作
        aaa.transferTo(new File(file,newFileName));
        return "redirect:/upload.jsp";

    }

}
