package org.example;

import org.example.aspect.Myaspect;
import org.example.beans.Book;
import org.example.beans.beanCollection.CustomerListHolder;
import org.example.beans.inheritance.Cat;
import org.example.beans.inheritance.Person;
import org.example.beans.innerbeans.Customer;
import org.example.service.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.example.beans.ClientService;
import org.example.scope.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Create context with XML
        ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
        org.example.beans.ClientService service = (ClientService) context.getBean("clientService");
        service.doWork();

        // Example Singleton and Prototype
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();

        // Create context with Annotation
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);

        Book book = context1.getBean(Book.class);
        System.out.println("Book's author: " + book.getAuthor().getName());

        // Create bean with XML
        Book book1 = (Book) context.getBean(Book.class);
        System.out.println("Book author:" + book1.getAuthor().getName());

        //Create inner bean
        Customer cus1 = (Customer) context.getBean(Customer.class);
        System.out.println("Customer name:" + cus1.getPerson().getName());
        System.out.println("Address:" + cus1.getPerson().getAddress());
        System.out.println("Age:" + cus1.getPerson().getAge());

        //Create Collection
        CustomerListHolder lists1 = (CustomerListHolder) context.getBean("CustomerListHolder");
        lists1.printList();

        //Inheritance Demo
        Person ng1 = (Person) context.getBean("children");
        ng1.showInfo();
        Cat cat1 = (Cat) context.getBean("cat");
        cat1.showInfo();

        //Demo aspects with java config
        A a = context1.getBean(A.class);
        a.m1();
        a.m2();
        a.m3();
        a.n1();

        A b =(A) context.getBean("a");
        b.m1();
        b.m2();
        b.m3();
        b.n1();

        //Demo aspects with XML
        Myaspect c =(Myaspect) context.getBean("myService");
        c.doSomething();
    }
    }
