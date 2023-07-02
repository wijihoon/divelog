package com.fastcampus.springrunner.divelog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("my-service")
@SpringBootTest(args={"--app.name=dive-log-test"})
class DiveLogApplicationTests {

	@Test
	void testApplicationArguments(@Autowired ApplicationArguments appArguments) {
		assertThat(appArguments.getOptionNames()).contains("app.name");
		assertThat(appArguments.getOptionValues("app.name")).contains("dive-log-test");
	}

}
