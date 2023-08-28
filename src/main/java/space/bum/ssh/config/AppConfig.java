package space.bum.ssh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import space.bum.ssh.Parrot;

@Configuration
public class AppConfig {
	@Bean
	String message() {
		return "10월 5일 쾌청 기원";
	}
	
	@Bean
	Integer unit() {
		return 1004;
	}
	
	@Bean
	Parrot parrot() {
		var rookie = new Parrot();
		rookie.setName("Rookie");
		return rookie;
	}
}
