package com.test;

import com.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils(){
        /*for (int i = 0; i < 10; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }*/
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
    }
}
