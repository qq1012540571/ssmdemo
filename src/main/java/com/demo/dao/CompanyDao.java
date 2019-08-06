package com.demo.dao;


import com.demo.pojo.Company;

import java.util.List;

public interface CompanyDao {

     public List<Company> selectUser();

     public  Company findOne(Long id);

}
