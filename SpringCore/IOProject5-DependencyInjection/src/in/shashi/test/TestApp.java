package in.shashi.test;

import in.shashi.bean.A;
import in.shashi.bean.B;



import java.nio.file.FileSystems;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp {

    public static void main(String[] args) {

        FileSystemResource resource = new FileSystemResource("./src/in/shashi/config/application.xml");

        @SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(resource);

        A a = factory.getBean("a1",A.class);
        B b = factory.getBean("b1", B.class);

        System.out.println("Generator1 class object reference :: "+a.hashCode());
        System.out.println("Generator2 class object reference :: "+b.hashCode());

        System.out.println("   ");

        System.out.println(a);
        System.out.println(b);
    }
}

