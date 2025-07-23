package org.example.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean()" + this);
    }
}
