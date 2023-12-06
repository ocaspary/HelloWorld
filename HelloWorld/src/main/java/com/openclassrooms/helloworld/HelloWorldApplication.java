// Voir cours openclassroom

package com.openclassrooms.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassrooms.helloworld.model.HelloWorld;
import com.openclassrooms.helloworld.service.BusinessService;

// Si problème d'arborescence (répertoires au même niveau et pas en sous-répertoires) :
// @SpringBootApplication(scanBasePackages = { "com.openclassrooms.*" })

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {

	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);

	}

}