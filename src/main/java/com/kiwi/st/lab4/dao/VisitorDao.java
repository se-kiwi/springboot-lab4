package com.kiwi.st.lab4.dao;

import com.kiwi.st.lab4.entity.Visitor;
import org.springframework.data.repository.CrudRepository;

public interface VisitorDao extends CrudRepository<Visitor, String> {

    Boolean existsByUsernameAndPassword(String username, String password);

    Visitor getByUsernameAndPassword(String username, String password);

    Boolean existsByUsernameAndCode(String username, String code);

}
