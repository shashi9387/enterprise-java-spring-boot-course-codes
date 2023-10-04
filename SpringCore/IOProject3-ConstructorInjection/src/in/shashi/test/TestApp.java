package in.shashi.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.shashi.bean.Employee;

@SuppressWarnings("deprecation")
public class TestApp {

    public static void main(String[] args) {

        FileSystemResource resource = new FileSystemResource("./src/application.xml");

        XmlBeanFactory factory = new XmlBeanFactory(resource);

        Employee employee = factory.getBean("emp", Employee.class);
        
        System.out.println(employee);
    }
}

