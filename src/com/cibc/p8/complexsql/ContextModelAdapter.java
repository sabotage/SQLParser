package com.cibc.p8.complexsql;

import java.lang.reflect.Method;

import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ModelAdaptor;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

public class ContextModelAdapter implements ModelAdaptor {

	  @Override
	  public Object getProperty(Interpreter interpreter, ST seld, Object o, Object property, String propertyName) throws STNoSuchPropertyException
	  {
	      Method m = null;
	      try {
	          String mn = "get" + Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1);
	          m = o.getClass().getMethod(mn);
	      } catch (Exception e) {
	      }
	      if (m == null) 
	          try {
	              m = o.getClass().getDeclaredMethod(propertyName);
	          } catch (Exception e) {
	          }

	      if (m != null) try {
	          return m.invoke(o);
	      } catch (Exception e) {
	          throw new STNoSuchPropertyException(e, property, propertyName);
	      }
	      else 
	          throw new STNoSuchPropertyException(null, property, propertyName);
	  }
}
