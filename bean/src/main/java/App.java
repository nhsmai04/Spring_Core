import model.*;
import config.*;
import service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static model.book_static.createInstance;

public class App {
    public static void main(String[] args){

        //XML
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Author author = (Author) context.getBean("author");
        author.show();

        //Config_Bean
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(AppConfig_Bean.class);
        Author javaAuthor = (Author) javaContext.getBean("author");
        javaAuthor.show();

        //Config_Comp
        ApplicationContext annoContext= new AnnotationConfigApplicationContext(AppConfig_Comp.class);
        Author_Comp annoAuthor = annoContext.getBean(Author_Comp.class);
        annoAuthor.show();

        //Config_Autowired
        ApplicationContext autoContext = new AnnotationConfigApplicationContext(AppConfig_Auto.class);
        Book book = autoContext.getBean(Book.class);
        book.show();

        //Factory_static
        ApplicationContext staticContext = new ClassPathXmlApplicationContext("bean.xml");
        book_static bookStatic = staticContext.getBean("book", book_static.class);
        System.out.println("Book: " +bookStatic);

        //Factory_instance
        ApplicationContext insContext = new ClassPathXmlApplicationContext("bean.xml");
        book_service service = (book_service) insContext.getBean("bookService");
        service.printBook();

        //BeanScopes_Singleton
        ApplicationContext single = new ClassPathXmlApplicationContext("bean.xml");

        HelloWord a = (HelloWord) single.getBean("helloWorld");
        a.setHello("Chào");
        a.getHello();

        HelloWord b = (HelloWord) single.getBean("helloWorld");
        b.getHello();

        //BeanScopes_Prototype
        ApplicationContext prototype = new ClassPathXmlApplicationContext("bean.xml");

        HelloWord c = (HelloWord) prototype.getBean("hello");
        c.setHello("Hi");
        c.getHello();

        HelloWord d = (HelloWord) prototype.getBean("hello");
        d.getHello();
    }
}
