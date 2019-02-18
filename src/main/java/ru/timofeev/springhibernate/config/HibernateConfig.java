package ru.timofeev.springhibernate.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@Configuration
public class HibernateConfig {
    @Bean
    @Autowired
    public SessionFactory sessionFactory(DataSource dataSource) throws Exception {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setPackagesToScan("tu.timofeev.dto");
        sessionFactoryBean.afterPropertiesSet();
        return sessionFactoryBean.getObject();
    }
}
