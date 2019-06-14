package i.t.c;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import i.t.c.kernel.RoleService;

public class AppStart {
	public static void main(String[] args) throws IOException
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("*.xml");
		context.start();
		RoleService  roleService = (RoleService) context.getBean("roleService");
		roleService.queryAll().forEach(f->{
			System.out.println("姓名:"+f.name+".年龄:"+f.age);
		});
		System.in.read();
	}
}
