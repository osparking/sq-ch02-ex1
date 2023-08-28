package space.bum.ssh;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import space.bum.ssh.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Parrot p = (Parrot) context.getBean(Parrot.class);
		System.out.println(p.getName());
	}

}
