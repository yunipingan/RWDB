package cn.pingweb.mapper;

import cn.pingweb.entity.UserScore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-config.xml"})
public class UserScoreDaoTest {
    @Autowired
    private UserScoreDao userScoreDao;

    @Test
    public void insert() throws Exception {
        userScoreDao.insert(new UserScore("testUid2", "123", 22));
    }

    @Test
    public void getUserByUid() throws Exception {
        System.out.println(userScoreDao.getUserByUid("testUid").getCreateTime());
    }

    @Test
    public void updateByUid() throws Exception {
    }

}