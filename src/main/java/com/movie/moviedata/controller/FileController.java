package com.movie.moviedata.controller;

import com.movie.file.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/12 22:53
 * @描述：
 */
@Controller
@RequestMapping("file")
@CrossOrigin
public class FileController {
    @Autowired
    private Utils utils;

    @ResponseBody
    @PostMapping("file-upload")
    public Object fileUpload(@RequestParam(value = "file") MultipartFile file){
        try {
            byte[] bytes = file.getBytes();
            String fileName = utils.upLoadFile(bytes, file.getOriginalFilename());
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
