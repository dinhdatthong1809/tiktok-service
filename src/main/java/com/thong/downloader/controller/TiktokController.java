package com.thong.downloader.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tiktok")
public class TiktokController {

    @GetMapping("/download")
    public ResponseEntity<Void> download() {
        return ResponseEntity.ok().build();
    }

}
