package com.yu.action;

import com.yu.domian.User;
import com.yu.service.JWTServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenAction {

    @Autowired
    private JWTServiceImpl jwtServicel;

    @GetMapping("getToken")
    public String getToken(User user) throws Exception {
        String token = jwtServicel.creatToken(user);
        return token;
    }

    @GetMapping("dncodeToken")
    public String encodeToken(String token) throws Exception {
        String s = jwtServicel.dncodeToken(token);
        return s;
    }


}
