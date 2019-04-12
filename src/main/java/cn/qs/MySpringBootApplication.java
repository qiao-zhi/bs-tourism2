package cn.qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// Servlet、Filter、Listener可以直接通过@WebServlet、@WebFilter、@WebListener注解自动注册，无需其他代码。
@ServletComponentScan("cn")
public class MySpringBootApplication {
	public static void main(String[] args) {
		// 入口运行类
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
