package com.fastcampus.springrunner.divelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiveLogApplication {

	public static void main(String[] args) {
		for(String arg: args) {
			System.out.println("Argument: " + arg);
		}
		System.out.println("Hello World!");
		SpringApplication.run(DiveLogApplication.class, args);

		// SpringApplicationBuilder 사용
//		SpringApplication application = new SpringApplication(DiveLogApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.addListeners(new ApplicationPidFileWriter()
//								, new WebServerPortFileWriter());
//		application.run(args);

		// SpringApplicationBuilder 사용2
//		new SpringApplicationBuilder(DiveLogApplication.class)
//				.bannerMode(Banner.Mode.OFF)
//				.listeners(new ApplicationPidFileWriter()
//						, new WebServerPortFileWriter())
//				.build().run(args);
	}
}
