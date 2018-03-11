package com.bswen.multids.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bswen.multids.domain.People;

/**
 * Created by  on 2017-1-13.
 *
 * @author xxx
 */
@Component
@EnableBatchProcessing
public class UserDao {
    private static Log log = LogFactory.getLog(UserDao.class);
    @Autowired
    @Qualifier("jdbcMaster")
    private JdbcTemplate jdbcTemplate;
    @Autowired
    @Qualifier("jdbcSecondary")
    private JdbcTemplate jdbcTemplate2;

    /**
     * query
     * @return
     */
    public List<People> queryUsersMySQL() {
        String sql = "select * from people";
        return this.jdbcTemplate.query(
                sql, new Object[]{},
                new RowMapper<People>() {
                    public People mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	People user = new People();
                        user.setId(rs.getInt("id"));
                        user.setName(rs.getString("name"));
                        user.setSurName(rs.getString("surname"));
                        user.setFullName(rs.getString("fullname"));
                        user.setEmail(rs.getString("email"));
                        return user;
                    }
                });
    }

    /**
     * query
     * @return
     */
    public List<People> queryUsersPost() {
        String sql = "select * from people";
        return this.jdbcTemplate2.query(
                sql, new Object[]{},
                new RowMapper<People>() {
                    public People mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	People user = new People();
                        user.setId(rs.getInt("id"));
                        user.setName(rs.getString("name"));
                        user.setSurName(rs.getString("surname"));
                        user.setFullName(rs.getString("fullname"));
                        user.setEmail(rs.getString("email"));
                        return user;
                    }
                });
    }
}
