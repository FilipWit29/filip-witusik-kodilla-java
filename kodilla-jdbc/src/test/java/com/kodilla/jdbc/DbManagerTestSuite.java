package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {

    @Test
    void testConnection() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(15,counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT u.firstname, u.lastname\n" +
        "FROM USERS u JOIN POSTS p ON u.id = p.user_id\n" +
        "GROUP BY u.id\n" +
        "HAVING COUNT(p.id) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("Firstname") + " " +
                    rs.getString("Lastname"));
            counter++;
        }

        assertEquals(1, counter);
    }
}
