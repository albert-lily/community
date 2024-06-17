package life.majiang.community.model;

public class Notification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.notifier
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long notifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.receiver
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.outer_id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long outerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.type
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.gmt_create
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.status
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIER_NAME
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private String notifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.OUTER_TITLE
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private String outerTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.id
     *
     * @return the value of notification.id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.id
     *
     * @param id the value for notification.id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.notifier
     *
     * @return the value of notification.notifier
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getNotifier() {
        return notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.notifier
     *
     * @param notifier the value for notification.notifier
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setNotifier(Long notifier) {
        this.notifier = notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.receiver
     *
     * @return the value of notification.receiver
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.receiver
     *
     * @param receiver the value for notification.receiver
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.outer_id
     *
     * @return the value of notification.outer_id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getOuterId() {
        return outerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.outer_id
     *
     * @param outerId the value for notification.outer_id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.type
     *
     * @return the value of notification.type
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.type
     *
     * @param type the value for notification.type
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.gmt_create
     *
     * @return the value of notification.gmt_create
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.gmt_create
     *
     * @param gmtCreate the value for notification.gmt_create
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.status
     *
     * @return the value of notification.status
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.status
     *
     * @param status the value for notification.status
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIER_NAME
     *
     * @return the value of notification.NOTIFIER_NAME
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public String getNotifierName() {
        return notifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIER_NAME
     *
     * @param notifierName the value for notification.NOTIFIER_NAME
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setNotifierName(String notifierName) {
        this.notifierName = notifierName == null ? null : notifierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.OUTER_TITLE
     *
     * @return the value of notification.OUTER_TITLE
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public String getOuterTitle() {
        return outerTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.OUTER_TITLE
     *
     * @param outerTitle the value for notification.OUTER_TITLE
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setOuterTitle(String outerTitle) {
        this.outerTitle = outerTitle == null ? null : outerTitle.trim();
    }
}