package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into community.user_k (ACCOUNT_ID, NAME, TOKEN, GMT_CREATE, GMT_MODIFIED,avatar_url) VALUES ( #{accountId},#{name},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl} )")
    void insert(User user);
    @Select("select * from community.user_k where token = #{token}")
    User findByToken(@Param("token") String token);
    @Select("select * from community.user_k where id = #{id}")
    User findById(@Param("id") int id);
}
