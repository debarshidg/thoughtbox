package com.att.portletb;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rss.model.Feed;
import com.rss.model.FeedMessage;
import com.rss.read.RSSFeedParser;

/**
 * Portlet implementation class PortletB
 */
public class PortletB extends MVCPortlet {
	@javax.portlet.ProcessEvent(qname = "{http://portleta.com}sendRSSLink")
	public void handleProcesseuserEmailAddressEvent(javax.portlet.EventRequest request, javax.portlet.EventResponse response) 
	            throws javax.portlet.PortletException, java.io.IOException {
	    javax.portlet.Event event = request.getEvent();
	    String rssLink = (String)event.getValue();
	    System.out.println("Passed rssLink - " + rssLink);
		RSSFeedParser parser = new RSSFeedParser(rssLink);
		Feed feed = parser.readFeed();
		StringBuffer rssResponse = new StringBuffer();
		for (FeedMessage message : feed.getMessages()) {
			if(rssResponse.length()!=0)
				rssResponse.append("<hr>");
			rssResponse.append(message.getTitle()).append("<br>").append(message.getDescription());
		}
		response.setRenderParameter("rssResponse",rssResponse.toString());
	}
}
