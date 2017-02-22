package com.pineapple.dapineapple;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginTest {
    @Test
    public void login()throws Exception{
        int nameLength = 2;
        assert(nameLength >= 8);
    }
}
