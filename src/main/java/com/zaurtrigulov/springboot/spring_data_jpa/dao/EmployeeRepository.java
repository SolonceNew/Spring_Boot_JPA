package com.zaurtrigulov.springboot.spring_data_jpa.dao;
import com.zaurtrigulov.springboot.spring_data_jpa.entity.Employee;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
// указываем какой ентити использует репозиторий и тип данных у primary key
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
 //репозиторий содержит в себе базовые методы работы и не требует их написания.
    //но если позникает необходимость прописать дополнительные методы, то это можно сделать
    //благодаря стандартизации методов, не требуется прописывать их реализациаю

    public List<Employee> findAllByName(String name);

}
