import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {

        try {
            Connection conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Kết nối thành công");
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("Kết nối thất bại: " + e.getMessage());
            e.printStackTrace();
        }

        ApplicationContext contextXML = new ClassPathXmlApplicationContext("beans.xml");
        StudentService student_XML = contextXML.getBean("studentService", StudentService.class);
        student_XML.study();

        AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService student_Java = contextJava.getBean(StudentService.class);
        student_Java.study();
        //student_Java.fail();
    }
}
