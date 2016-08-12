package com.myPackage;

import org.junit.Test;

import static org.junit.Assert.*;

// ConnectionTest class.
public class ConnectionTest
{
    @Test
    public void testConnect() throws Exception
    {
        String correctURL = "https://www.yandex.ru/";
        String uncorrectURL = "12345.77";

        assertFalse(Connection.connect(uncorrectURL));
        assertTrue(Connection.connect(correctURL));
    }
}