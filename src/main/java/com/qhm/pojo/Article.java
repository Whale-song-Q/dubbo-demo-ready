package com.qhm.pojo;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable{ 
	
    /**   
	 * @Fields serialVersionUID : TODO(这个变量表示什么)   
	 */  
	private static final long serialVersionUID = 1L;

	private Integer id;
	
    private String title;

    private String picture;

    private Integer channelId;

    private Integer categoryId;
    
    private String channelName;

    private String categoryName;

    private Integer userId;
    
    private String username;
    
    private String nickname;

    private Integer hits;

    private Integer hot;

    private Integer status;

    private Integer deleted;

    private Date created;

    private Date updated;

    private int commentcnt;

    private String content;
    
    private String statusIds;
    
    private int tousuCnt;

    private String  condition;
    
    
    
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getCommentcnt() {
		return commentcnt;
	}

	public void setCommentcnt(int commentcnt) {
		this.commentcnt = commentcnt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatusIds() {
		return statusIds;
	}

	public void setStatusIds(String statusIds) {
		this.statusIds = statusIds;
	}

	public int getTousuCnt() {
		return tousuCnt;
	}

	public void setTousuCnt(int tousuCnt) {
		this.tousuCnt = tousuCnt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", picture=" + picture + ", channelId=" + channelId
				+ ", categoryId=" + categoryId + ", channelName=" + channelName + ", categoryName=" + categoryName
				+ ", userId=" + userId + ", username=" + username + ", nickname=" + nickname + ", hits=" + hits
				+ ", hot=" + hot + ", status=" + status + ", deleted=" + deleted + ", created=" + created + ", updated="
				+ updated + ", commentcnt=" + commentcnt + ", content=" + content + ", statusIds=" + statusIds
				+ ", tousuCnt=" + tousuCnt + "]";
	}

	public Article(Integer id, String title, String picture, Integer channelId, Integer categoryId, String channelName,
			String categoryName, Integer userId, String username, String nickname, Integer hits, Integer hot,
			Integer status, Integer deleted, Date created, Date updated, int commentcnt, String content,
			String statusIds, int tousuCnt) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.channelId = channelId;
		this.categoryId = categoryId;
		this.channelName = channelName;
		this.categoryName = categoryName;
		this.userId = userId;
		this.username = username;
		this.nickname = nickname;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.commentcnt = commentcnt;
		this.content = content;
		this.statusIds = statusIds;
		this.tousuCnt = tousuCnt;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}