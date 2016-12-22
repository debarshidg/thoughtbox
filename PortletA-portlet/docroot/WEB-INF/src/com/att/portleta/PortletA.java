package com.att.portleta;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class PortletA
 */
public class PortletA extends MVCPortlet {
	public void sendRSSLink(ActionRequest actionRequest,
		   ActionResponse actionResponse) throws IOException{
		   String selectRSSURL = ParamUtil.getString(actionRequest,"selectRSSURL");
		   System.out.println("selectRSSURL " + selectRSSURL);
		   javax.xml.namespace.QName qName = new javax.xml.namespace.QName("http://portleta.com", "sendRSSLink", "event");
		   actionResponse.setEvent(qName,selectRSSURL);
	}
}
