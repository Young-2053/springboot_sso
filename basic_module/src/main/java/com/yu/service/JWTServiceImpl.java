package com.yu.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.yu.domian.User;
import jdk.nashorn.internal.parser.Token;
import org.springframework.stereotype.Service;

@Service
public class JWTServiceImpl {

    public String creatToken(User user) throws Exception{
        JWTCreator.Builder builder = JWT.create().withSubject(user.getUsername());

        Algorithm algorithm = Algorithm.HMAC256(user.getPassword());
        String token = builder.sign(algorithm);
        return token;
    }

    public String dncodeToken(String token) throws Exception{
        DecodedJWT decode = JWT.decode(token);
        String payload = decode.getSubject();
        return payload;
    }



}
