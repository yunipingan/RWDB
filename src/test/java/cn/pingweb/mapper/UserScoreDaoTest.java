package cn.pingweb.mapper;

import cn.pingweb.entity.UserScore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Test
    public void getUserByUid() throws Exception {
        System.out.println(userScoreDao.getUserByUid("testUid").getCreateTime());
        System.out.println("end");
    }

    @Transactional
    @Test
    public void getUserByUid2() throws Exception {
        System.out.println(userScoreDao.getUserByUid("testUid").getCreateTime());
        System.out.println("end2");
    }

    @Test
    public void updateByUid() throws Exception {
    }

}