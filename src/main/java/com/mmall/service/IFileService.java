package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by mark on 17-8-10.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
