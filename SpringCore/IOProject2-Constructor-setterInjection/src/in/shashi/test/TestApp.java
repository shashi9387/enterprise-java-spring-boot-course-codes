package in.shashi.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.shashi.bean.WishMessageGenerator;


@SuppressWarnings("deprecation")
public class TestApp {

    public static  void main(String[] args) {
    	
    	// using the FileSystemResource to locate the configuration file
        FileSystemResource resource = new FileSystemResource("src/applicationContext.xml");
     
        // Creating an IOC container
		@Deprecated
        XmlBeanFactory factory = new XmlBeanFactory(resource);
     
        // Requesting IOC container to give the Object,searching will happen in cache and if it is not found then object will created by loading and performing setter injection.
        WishMessageGenerator generator1 = factory.getBean("wmg",WishMessageGenerator.class);

        // using the target object performing the operation and printing the result
        String result = generator1.getMessage("Shashi");
        System.out.println(result);
    }
}

