package com.theatro.api.dao;

import com.theatro.api.dbutils.DatabaseUtil;
import com.theatro.api.response.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class GroupDao {
    public static final Logger LOGGER = LoggerFactory.getLogger(GroupDao.class);

    @Autowired
    DatabaseUtil databaseUtil;

    private JdbcTemplate bizJdbcTemplate;

    @Autowired
    public void setBizJdbcTemplate(@Qualifier("bizDatasource") DataSource bizDatasource) {
        this.bizJdbcTemplate = new JdbcTemplate(bizDatasource);
    }

    public List<Group> getGroupList(String storeName){
        List<Group> groupList = new ArrayList<>();

        int storeId = databaseUtil.getStoreIdbyName(storeName);
        String SQL = "SELECT name from groups where storeid=?";
        bizJdbcTemplate.query(SQL,new Object[]{storeId},new ResultSetExtractor<List<Group>>() {
            @Override
            public List<Group> extractData(ResultSet resultSet) throws SQLException, DataAccessException {

                while (resultSet.next()) {
                    Group group = new Group();
                    group.setName(resultSet.getString("name"));
                    groupList.add(group);
                }
                return groupList;
            }
        });
        return groupList;

    }

    public Group getGroup(String groupName){
        Group group = new Group();
        group.setName(groupName);
        return group;

    }
}
