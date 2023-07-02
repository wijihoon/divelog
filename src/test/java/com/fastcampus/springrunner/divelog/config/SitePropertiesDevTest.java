package com.fastcampus.springrunner.divelog.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("dev")
@SpringBootTest
class SitePropertiesDevTest {

    @Test
    void test(@Autowired SiteProperties siteProperties){
        assertThat(siteProperties.getAuthorName()).isEqualTo("Honeymon-dev");

        assertThat(siteProperties.getAuthorEmail()).isEqualTo("ihoneymon-dev@gmail.com");
    }
}