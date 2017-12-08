package cn.pingweb.mapper;

import cn.pingweb.core.DataSource;
import cn.pingweb.core.DynamicDataSourceGlobal;
import cn.pingweb.entity.UserScore;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserScoreDao {

    @DataSource(DynamicDataSourceGlobal.WRITE)
    @Insert("insert into user_score(uid, phone, score,createTime,updateTime) values(#{uid},#{phone},#{score},#{createTime},#{updateTime})")
    public int insert(UserScore userScore);

    @DataSource(DynamicDataSourceGlobal.READ)
    @Select("select * from user_score where uid=#{uid}")
    public UserScore getUserByUid(String uid);

    @Update("update user_score set score=#{score},updateTime=#{updateTime} where uid=#{uid} for update")
    public int updateByUid(UserScore userScore);

}
