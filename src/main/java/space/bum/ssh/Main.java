package space.bum.ssh;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import space.bum.ssh.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		try (
				var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			PrintStream out = new PrintStream(System.out, true, UTF_8);

			out.println((String) context.getBean("message"));
			out.println((Integer) context.getBean("unit"));
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
