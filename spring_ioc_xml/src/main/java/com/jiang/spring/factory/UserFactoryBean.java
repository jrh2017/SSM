package com.jiang.spring.factory;

import com.jiang.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author jiangronghua
 */
public class UserFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
