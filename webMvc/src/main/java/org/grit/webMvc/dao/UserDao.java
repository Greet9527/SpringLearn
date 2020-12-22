package org.grit.webMvc.dao;

import org.grit.webMvc.config.DataJdbcCfg;
import org.grit.webMvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class UserDao {

    @Autowired
    private DataJdbcCfg jdbcCfg;

    public User find() throws Exception {
        Connection conn = null;
        Statement statement = null;
        User user = new User();
        try {
            Class.forName(jdbcCfg.getDriver());
            conn = DriverManager.getConnection(jdbcCfg.getUrl(),jdbcCfg.getUsername(),jdbcCfg.getPassword());
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            if (resultSet.next()) {
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
                user.setId(resultSet.getInt("id"));
                user.setNike(resultSet.getString("nike"));
                user.setPassWord(resultSet.getString("password"));
            }

        } catch (Exception exception) {

            throw new Exception(exception);
        }
        return user;

    }
}
