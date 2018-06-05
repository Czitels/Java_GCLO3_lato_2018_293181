/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Customer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.NestedServletException;

/**
 *
 * @author bitel
 */
@Controller
public class CustomerModel {
    //CRUD
    List<Customer> lst = new ArrayList<Customer>();
    @RequestMapping()
    public List<Customer> getAll()
    {        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            s.beginTransaction();
            lst=s.createCriteria(Customer.class).list();
            s.getTransaction().commit();
            System.out.println(lst.get(0));
            System.out.println(lst.get(1));
            System.out.println(lst.get(2));
            System.out.println(lst.get(3));
            System.out.println(lst.get(4));
        }catch(HibernateException e)
        {
            e.printStackTrace();
        }
        return lst;
    }
    
    //Create
    public void create(Customer c)
    {
        List<Customer> lst = new ArrayList<Customer>();
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            s.beginTransaction();
            s.save(c);
            s.getTransaction().commit();
        }catch(Exception e)
        {
            s.getTransaction().rollback();

        }
    }
    
        //Remove
    public void remove(Customer c)
    {
        List<Customer> lst = new ArrayList<Customer>();
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            s.beginTransaction();
            s.delete(c);
            s.getTransaction().commit();
        }catch(Exception e)
        {
            s.getTransaction().rollback();

        }
    }
    
    //Update
        public void update(Customer c)
    {
        List<Customer> lst = new ArrayList<Customer>();
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();
        }catch(Exception e)
        {
            s.getTransaction().rollback();
        }
    }
        
    //Edit
        public void edit(Customer c)
    {
        List<Customer> lst = new ArrayList<Customer>();
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();
        }catch(Exception e)
        {
            s.getTransaction().rollback();
        }
    }
        
    public Customer getCustomer(BigDecimal id)
    {
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Customer c = new Customer();
        
        try{
            s.beginTransaction();
            c = (Customer) s.get(Customer.class, id);
            s.getTransaction().commit();
        }catch(Exception e)
        {
        }
        return c;
        
    }

}
