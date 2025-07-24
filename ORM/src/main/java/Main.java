import model.Student;
import dao.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

        Student student = new Student("Ốc Dev", "oc@example.com");
        studentDAO.save(student);

        Student found = studentDAO.findById(1);
        System.out.println("Tìm thấy: " + found.getName());
    }
}
