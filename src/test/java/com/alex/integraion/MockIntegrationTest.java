package com.alex.integraion;

import com.alex.integraion.init.SpringMockerJettyRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * User: oleksandr.baglai
 * Date: 11/18/12
 * Time: 4:47 PM
 */
public class MockIntegrationTest {
//    private WebDriver driver;
//    private SpringMockerJettyRunner runner;
//    private Service service;
//    private OtherService otherService;
//
//    @Before
//    public void startServer() throws Exception {
//        runner = new SpringMockerJettyRunner("src/main/webapp", "/mocker");
//    }
//
//    @After
//    public void stop() throws Exception {
//        runner.stop();
//    }

//    @Test
//    public void shouldGetMessageFromService_mockOneService() throws Exception {
//        // given
//        givenMockFor("service");
//
//        when(service.getString()).thenReturn("Mocked Service!");
//
//        // when
//        driver.get(runner.getUrl());
//
//        // then
//        verify(service).getString();
//
//        assertResult("Mocked Service!");
//    }
//
//    @Test
//    public void shouldGetMessageFromService_mockAnotherService() throws Exception {
//        // given
//        givenMockFor("otherService");
//
//        when(otherService.getOtherString()).thenReturn("Mocked OtherService!");
//
//        // when
//        driver.get(runner.getUrl());
//
//        // then
//        verify(otherService).getOtherString();
//
//        assertResult("Hello from Service! Mocked OtherService!");
//    }
//
//    private void assertResult(String expected) {
//        String message = driver.findElement(By.id("message")).getText();
//        assertEquals(expected, message);
//    }
//
//    private void givenMockFor(String name) throws Exception {
//        runner.mockBean(name);
//        runner.start();
//        service = runner.getBean("service");
//        otherService = runner.getBean("otherService");
//        driver = new HtmlUnitDriver(true);
//    }
}