package com.walliee.springcorebindstringtointissue;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public class ApplicationSettings {
    private String property;

    public void setProperty(int property) {
        this.property = String.valueOf(property);
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
