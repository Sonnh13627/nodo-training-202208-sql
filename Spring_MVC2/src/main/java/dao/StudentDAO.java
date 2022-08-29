package dao;

import entity.Student;

import java.util.List;

public interface StudentDAO {
    public void insert(Student student);

    public List<Student> list();
    public void delete(Integer id);

    public Student get(Integer id);
    public void update(Student student);

    public List<Student> search(String name);
}
