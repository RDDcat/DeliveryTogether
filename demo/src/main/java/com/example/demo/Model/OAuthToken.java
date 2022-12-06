package com.example.demo.Model;

import lombok.Data;

@Data
public class OAuthToken {
    String access_token;
    String token_type;
    String refresh_token;
    String id_token;
    String expires_in;
    String scope;
    String refresh_token_expires_in;
}
