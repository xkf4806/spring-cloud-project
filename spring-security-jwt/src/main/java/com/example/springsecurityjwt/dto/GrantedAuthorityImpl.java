package com.example.springsecurityjwt.dto;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-09-23 17:16
 **/
public class GrantedAuthorityImpl implements GrantedAuthority {
    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
