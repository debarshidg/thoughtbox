<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="javax.portlet.ActionRequest"%>

<portlet:defineObjects />
<portlet:actionURL var="sendRSSLinkURL" windowState="normal" name="sendRSSLink"></portlet:actionURL>

Source - Event Publishing Portlet
<hr>
<p>Select the Accenture RSS feed from below options</p>

<form action="<%=sendRSSLinkURL%>"  name="selectRssForm" method="POST">
	<select name="<portlet:namespace/>selectRSSURL">
		<option value="https://newsroom.accenture.com/subjects/analytics/rss.xml">Accenture Analytics</option>
	   	<option value="https://newsroom.accenture.com/industries/communications/rss.xml">Accenture Communication</option>
	   	<option value="https://newsroom.accenture.com/subjects/digital/rss.xml">Accenture Digital</option>
	   	<option value="https://newsroom.accenture.com/subjects/technology/rss.xml">Accenture Technology</option>
	</select>
	<input type="submit" name="selectRSSFeed" id="selectRSSFeed" value="Submit"/>
</form>