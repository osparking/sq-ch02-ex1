package space.bum.ssh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import space.bum.ssh.Parrot;

@Configuration
public class AppConfig {
	@Bean
	Parrot parrot() {
		var rookie = new Parrot();
		rookie.setName("Rookie");
		return rookie;
	}
}
