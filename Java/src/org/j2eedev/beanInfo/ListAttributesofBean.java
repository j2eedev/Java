package org.j2eedev.beanInfo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 */
public class ListAttributesofBean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try {
		    
	        BeanInfo bi = Introspector.getBeanInfo(DashBoard.class);
	        PropertyDescriptor[] pds = bi.getPropertyDescriptors();
	        List<String> beanAttributes=new ArrayList<String>();
	        for (int i=0; i<pds.length; i++) {
	            // Get property name
	            String propName = pds[i].getName();
	            beanAttributes.add(propName);
	        }
	        for(String beanAttr:beanAttributes){
	        	System.out.print(":"+beanAttr+":");
	        }
	    } catch (java.beans.IntrospectionException e) {
	    	System.err.println(e.getMessage());
	    }
	    
	}

}
