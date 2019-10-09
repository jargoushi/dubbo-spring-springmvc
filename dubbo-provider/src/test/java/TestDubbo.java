import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Version 1.0
 * @Author:ruwb
 * @Date:2019/10/9
 * @Content:
 */
public class TestDubbo {

    public static void main(String[] args) throws IOException {

        // 获取spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-provider.xml");

        // 启动spring容器
        context.start();

        System.out.println("服务注册成功");

        // 当输入任意键时再退出
        System.in.read();
    }
}
