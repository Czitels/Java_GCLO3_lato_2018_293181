/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.CustomerModel;
import java.lang.NoClassDefFoundError;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.util.NestedServletException;

/**
 *
 * @author bitel
 */
@Controller
public class CustomerController {
    
    @RequestMapping("index")
    public ModelAndView redireccio()
    {
        
        ModelAndView MV= new ModelAndView();
        MV.setView("index");
        
        return MV;
    }
    
    @RequestMapping(value="getAll",method = RequestMethod.GET)
    public String getAll(Model m)
    {
        CustomerModel model = new CustomerModel();
        m.addAttribute("lst",model.getAll());
        
        
        /*List <String> mylst= new ArrayList<String>();
        
        mylst.add("1");
        
        mylst.add("2");
        
        m.addAttribute("mylst",mylst);
        m.addAttribute("test","test10");*/
        
        
        return "data";
    }
    
}
