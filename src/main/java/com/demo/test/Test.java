package com.demo.test;

import com.demo.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 黄豪强
 * @create 2019/8/6 14:29
 */
public class Test extends  BaseJunit4Test {
     @Autowired
    CompanyDao companyDao;
    @org.junit.Test
    public  void search()
    {
        companyDao.findOne(20L);
    }
}
