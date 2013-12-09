package it.matteo.service;

import java.util.HashMap;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;

import it.matteo.model.Tweet;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TwitterServiceTest extends AppEngineTestCase {

    private TwitterService service = new TwitterService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
    
    @Test
    public void tweet() throws Exception {
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("content", "Hello");
        Tweet tweeted = service.tweet(input);
        assertThat(tweeted, is(notNullValue()));
        Tweet stored = Datastore.get(Tweet.class, tweeted.getKey());
        assertThat(stored.getContent(), is("Hello"));
    }
}