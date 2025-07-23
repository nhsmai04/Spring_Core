package org.example;

import org.example.scope.PrototypeBean;
import org.example.scope.SingletonBean;
import org.example.config.AppConfig;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService us = context.getBean(UserService.class);

        SingletonBean singletonBean = context.getBean(SingletonBean.class);
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);

        User user = new User();
        user.setName("Van Lý Tuấn");

        User user1 = new User();
        user1.setName("Lý Tuấn");

        us.save(user);
        us.save(user1);

        List<User> users = us.findAll();
        for (User u : users) {
            System.out.println(u.getName());
        }

        User user2 = us.findOne(1);
        System.out.println(user2.getName());

        us.delete(user1);

        context.close();
    }
}
