package com.venh.msa.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VenhMsaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenhMsaConfigServerApplication.class, args);
	}

}
