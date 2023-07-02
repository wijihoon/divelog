package com.fastcampus.springrunner.divelog.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "my-service")
public class MyServiceProperties {
    private boolean enabled;
    private InetAddress remoteAddress;
    private final Security security = new Security();

    @Getter
    @Setter
    public static class Security {
        private String username;
        private String password;
        private List<String> roles = new ArrayList<>();
        private Map<String, Boolean> attrs = new HashMap<>();

        // ... getters and setters
    }
}
