package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Comment;
import life.majiang.community.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int insert(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int insertSelective(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    List<Comment> selectByExampleWithRowbounds(CommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int updateByExampleSelective(@Param("row") Comment row, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int updateByExample(@Param("row") Comment row, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int updateByPrimaryKeySelective(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Jun 15 23:55:22 GMT+08:00 2024
     */
    int updateByPrimaryKey(Comment row);
}