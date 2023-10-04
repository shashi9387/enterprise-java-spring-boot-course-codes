package in.shashi.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.shashi.bean.Person;

public class ClientApp {

    public static void main(String[] args) {
    	
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        
        reader.loadBeanDefinitions("in/shashi/config/Application.xml");
        
        Person person1 = factory.getBean("p1", Person.class);
       System.out.println(person1);
       
       Person person2 = factory.getBean("p2", Person.class);
       System.out.println(person2);
       
       
        
    }
}

