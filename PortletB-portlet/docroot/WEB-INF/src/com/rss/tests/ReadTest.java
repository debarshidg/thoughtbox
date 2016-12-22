package com.rss.tests;

import com.rss.model.Feed;
import com.rss.model.FeedMessage;
import com.rss.read.RSSFeedParser;

public class ReadTest {
  public static void main(String[] args) {
    //RSSFeedParser parser = new RSSFeedParser("https://www-356.ibm.com/partnerworld/wps/servlet/pwdyn/Feed?cmsId=isv_ast_nws_rss_feeds&attachmentName=pwcloud.xml");
	  RSSFeedParser parser = new RSSFeedParser("https://newsroom.accenture.com/news/rss.xml");
    Feed feed = parser.readFeed();
    System.out.println(feed);
    for (FeedMessage message : feed.getMessages()) {
      System.out.println(message);
    }

  }
} 

