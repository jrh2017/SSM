package com.jiang.spring.dao.imple;

import com.jiang.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author jiangronghua
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
