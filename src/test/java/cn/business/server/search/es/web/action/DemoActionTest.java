package cn.business.server.search.es.web.action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoActionTest {

    @Autowired
    private DemoAction demoAction;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void helloworld() {
        demoAction.helloworld();
    }
}