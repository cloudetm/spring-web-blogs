package pl.dmichalski.rss.service.impl;

import org.junit.Before;
import org.junit.Test;
import pl.dmichalski.rss.entity.RssFeedEntryEntity;
import pl.dmichalski.rss.exception.RSSException;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RssServiceTest {

    private RssService rssService;

    @Before
    public void setUp() throws Exception {
        rssService = new RssService();
    }

    @Test
    public void testGetItems() throws RSSException {
        File file = new File("src/test/resources/javavids.xml");
        List<RssFeedEntryEntity> itemEntities = rssService.getItems(file);
        assertThat(10, is(itemEntities.size()));
        RssFeedEntryEntity firstRssFeedEntryEntity = itemEntities.get(0);
        assertThat("How to solve Source not found error during debug in Eclipse", is(firstRssFeedEntryEntity.getTitle()));
        assertThat("22 06 2014 22:35:49", is(new SimpleDateFormat("dd MM yyyy HH:mm:ss").format(firstRssFeedEntryEntity.getPublishedDate())));

    }
}