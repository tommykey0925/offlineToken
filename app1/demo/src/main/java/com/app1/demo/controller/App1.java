package com.app1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1 {
    @GetMapping("/app1")
    public String app1(@RequestHeader("Authorization") String token) {
        try {
            // tokenがない時は400エラーになってくれるからOptionalにしなくてもOK
            // TODO:あとはrefresh tokenをリクエストから取得してアクセストークンを取得するようにする
            // TODO:app2にrefresh tokenを渡しつつリクエストを送る
            // TODO:レスポンスもsysoutする
            return "app1 connected!";
        } catch(Exception e) {
            return e.getMessage();
        }
    }
}
