package service;

import beans.User;
import dao.BankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT ,rollbackFor = NullPointerException.class)
public class BankService {

    @Autowired
    private BankDao bankDao;

    public void exchange(int difference) {
        bankDao.reduce(difference, 2);
        bankDao.increase(difference, 1);
    }

    public void query() {
        System.out.println(bankDao.query());
    }
}
