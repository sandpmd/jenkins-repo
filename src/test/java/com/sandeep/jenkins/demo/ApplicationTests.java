package com.sandeep.jenkins.demo;

import com.sandeep.jenkins.demo.controller.JenkinsController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@InjectMocks
	private JenkinsController jenkinsController;
	@Test
	void contextLoads() {
		jenkinsController.getName();
	}

}
