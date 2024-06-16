package life.majiang.community.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.account_id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.name
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.token
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.gmt_create
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.gmt_modified
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.bio
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private String bio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_k.avatar_url
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.id
     *
     * @return the value of user_k.id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.id
     *
     * @param id the value for user_k.id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.account_id
     *
     * @return the value of user_k.account_id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.account_id
     *
     * @param accountId the value for user_k.account_id
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.name
     *
     * @return the value of user_k.name
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.name
     *
     * @param name the value for user_k.name
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.token
     *
     * @return the value of user_k.token
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.token
     *
     * @param token the value for user_k.token
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.gmt_create
     *
     * @return the value of user_k.gmt_create
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.gmt_create
     *
     * @param gmtCreate the value for user_k.gmt_create
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.gmt_modified
     *
     * @return the value of user_k.gmt_modified
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.gmt_modified
     *
     * @param gmtModified the value for user_k.gmt_modified
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.bio
     *
     * @return the value of user_k.bio
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public String getBio() {
        return bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.bio
     *
     * @param bio the value for user_k.bio
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_k.avatar_url
     *
     * @return the value of user_k.avatar_url
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_k.avatar_url
     *
     * @param avatarUrl the value for user_k.avatar_url
     *
     * @mbg.generated Sun Jun 16 16:39:56 GMT+08:00 2024
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}