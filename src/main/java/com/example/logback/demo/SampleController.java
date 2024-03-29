package com.example.logback.demo;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    Logger loggerA = org.slf4j.LoggerFactory.getLogger("com.hoge");
    Logger loggerB = org.slf4j.LoggerFactory.getLogger(getClass().getPackage().getName());


    @GetMapping("/")       // URLのパスの指定
    private String top() { // リクエストを受け付けるメソッド

        loggerA.info("これはrootロガーのみ継承されているためFILE_Aのみに出力されます。");
        loggerB.info("これはcom.exampleロガーを継承しているのでFILE_AとFILE_Bに出力されます。");

        return "/index";
    }
}