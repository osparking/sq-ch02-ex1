package space.bum.ssh;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import space.bum.ssh.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(AppConfig.class);

	}

}
