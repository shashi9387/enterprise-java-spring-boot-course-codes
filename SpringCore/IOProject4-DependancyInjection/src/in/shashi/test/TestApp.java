package in.shashi.test;

import in.shashi.bean.WishMessageGenerator;
import org.springframework.core.io.FileSystemResource;


import java.nio.file.FileSystems;

public class TestApp {

    public static void main(String[] args) {

        FileSystemResource resource = new FileSystemResourse("../src/application.xml");

        XmlBeanFactory factory = new XmlBeanFactory(resourse);

        WishMessageGenerator generator1 = factroy.getBean("wmg",WishMessageGenerator.class);
        WishMessageGenerator generator2 = factory.getBean("wmg", WishMessgeGenerator.class);

        System.out.println("Generator1 class object reference :: "+generator1.hashCode());
        System.out.println("Generator2 class object reference :: "+generator2.hashCode());

        System.out.println("   ");

        String result = generator1.getMessage("Shashi");
        System.out.println(result);
    }
}

