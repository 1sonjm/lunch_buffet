package com.buffet.lunchapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
//Oauth2 권한 서버
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

}
