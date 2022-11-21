package com.mluneau.atelierbackendjava;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtelierBackendJavaApplication implements CommandLineRunner {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(AtelierBackendJavaApplication.class, args);
	}

	@Override
    public void run(String... args) throws IOException {
        // TODO Auto-generated method stub
        
    }

}
