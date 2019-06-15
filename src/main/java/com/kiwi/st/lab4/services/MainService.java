package com.kiwi.st.lab4.services;

import com.kiwi.st.lab4.dao.VisitorDao;
import com.kiwi.st.lab4.dto.LoginForm;
import com.kiwi.st.lab4.dto.Response;
import com.kiwi.st.lab4.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MainService {

    @Autowired
    private VisitorDao visitorDao;

    public Response tryLogin(LoginForm form) {
        Visitor visitor = visitorDao.getByUsernameAndPassword(form.getUsername(), form.getPassword());
        if (visitor == null) {
            return new Response(false, "");
        }

        String code = UUID.randomUUID().toString();
        visitor.setCode(code);
        visitorDao.save(visitor);
        return new Response(true, code);
    }

    public String sayHello(String code) {
        String res = "You are not welcome!";
        Visitor visitor = visitorDao.getByCode(code);
        if (visitor != null) {
            res = "Hello, " + visitor.getUsername() + ". Have a nice day!";
        }
        return res;
    }
}
