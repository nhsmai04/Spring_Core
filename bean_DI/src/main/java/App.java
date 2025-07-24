import model.Cat;
import model.Classroom;
import model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Reference
        Classroom ref_class = (Classroom) context.getBean("ref_class");
        ref_class.show();
        System.out.print("\n");

        //Inner Bean
        Classroom inner_class = (Classroom) context.getBean("inner_class");
        inner_class.show();
        System.out.print("\n");

        //Collection
        Classroom col_class = (Classroom) context.getBean("col_class");
        col_class.show();
        System.out.print("\n");

        //Properties
        Classroom prop_class = (Classroom) context.getBean("prop_class");
        prop_class.show();

        //Inheritance
        Student inh_student = (Student) context.getBean("inh_student");
        inh_student.speak();

        Cat inh_cat = (Cat) context.getBean("cat");
        inh_cat.speak();
    }
}
