package in.shashi.test;

import in.shashi.bean.WishMessageGenerator;



import java.nio.file.FileSystems;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp {

    public static void main(String[] args) {

        FileSystemResource resource = new FileSystemResource("./src/application.xml");

        @SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(resource);

        WishMessageGenerator generator1 = factory.getBean("wmg",WishMessageGenerator.class);
        WishMessageGenerator generator2 = factory.getBean("wmg", WishMessageGenerator.class);

        System.out.println("Generator1 class object reference :: "+generator1.hashCode());
        System.out.println("Generator2 class object reference :: "+generator2.hashCode());

        System.out.println("   ");

        String result = generator1.getMessage("Shashi");
        System.out.println(result);
    }
}

