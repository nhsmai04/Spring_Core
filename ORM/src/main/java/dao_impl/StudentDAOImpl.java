package dao_impl;

import dao.StudentDAO;
import model.Student;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public void save(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return sessionFactory.getCurrentSession().get(Student.class, id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Student", Student.class)
                .list();
    }
}
