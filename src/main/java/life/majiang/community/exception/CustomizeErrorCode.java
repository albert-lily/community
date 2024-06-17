package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND(2001,"你找的问题不在了，要不换个试试？？？"),
    TARGET_PARAM_NOt_FOUND(2002,"未选中任何问题或评论进行回复！！！"),
    NO_LOGIN(2003,"当前操作需要登录，请登录后重试！！！"),
    SYS_ERROR(2004,"服务器冒烟了，要不你稍后再试试！！！"),
    TYPE_PARAM_LOST(2005,"评论类型错误或不存在！！！"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不存在了！！！" ),
    COMMENT_IS_NULL(2007,"评论内容不能为空，请重试！！！"),
    READ_NOTIFICATION_FAIL(2008,"你不能查看别人的私信！！！"),
    NOTIFICATION_NOT_FOUND(2009,"消息不翼而飞了！！！"),
    FILE_UPLOAD_ERROR(2010,"图片上传失败！！！");
    private String message;
    private Integer code;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
