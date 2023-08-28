package space.bum.ssh;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import space.bum.ssh.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Parrot p = (Parrot) context.getBean("parrot");
		System.out.println(p.getName());
		
    System.setOut(new PrintStream(
    		new FileOutputStream(FileDescriptor.out), 
    		true, StandardCharsets.UTF_8));
    
		var msg = (String) context.getBean("message");
		System.out.println(msg);
		
		var unit = (Integer) context.getBean("unit");
		System.out.println(unit);
	}

}
