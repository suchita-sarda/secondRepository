package com.kruders.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LocaleAction extends DispatchAction{
	
	public ActionForward english(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
			request.getSession().setAttribute(
				Globals.LOCALE_KEY, Locale.ENGLISH);
		
		return mapping.findForward("success");
	}
	
	public ActionForward german(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		
		request.getSession().setAttribute(
				Globals.LOCALE_KEY, Locale.GERMAN);
	
		return mapping.findForward("success");
	}
	
	public ActionForward hindi (ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		Locale locale1 = new Locale("hi"); 

		request.getSession().setAttribute(
				Globals.LOCALE_KEY, locale1);
		return mapping.findForward("success");
		
		
	}
	
	public ActionForward marathi (ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		Locale locale1 = new Locale("mr"); 

		request.getSession().setAttribute(
				Globals.LOCALE_KEY, locale1);
		return mapping.findForward("success");
		
		
	}
}
