package com.buffet.lunchapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
//API 접근시 인증 권한 설정
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    private final Environment env;

    public ResourceServerConfig(Environment env) {
        this.env = env;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        if (isLocalMode()) {
            setLocalMode(http);
        } else {
            setPublishMode(http);
        }
    }

    /*
     * TODO 기록
     *
     * WebSecurityConfigurerAdapter 상속받아 설정해도 .@EnableResourceServer 로 설정을 설정된 것 이여서
     * 적용받지 못하였고 ResourceServerConfigurerAdapter 로 상속받아서 설정한 후에야 해결
     */
    private boolean isLocalMode() {
        if (env.getActiveProfiles().length > 0) {
            return false;
        } else {
            return true;
        }
    }

    private void setLocalMode(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/h2-console/*")
                .permitAll()

                .and()
                .csrf()
                .disable()

                .headers()
                .frameOptions()
                .disable();
    }

    private void setPublishMode(HttpSecurity http) throws Exception {
        super.configure(http);
    }
}
