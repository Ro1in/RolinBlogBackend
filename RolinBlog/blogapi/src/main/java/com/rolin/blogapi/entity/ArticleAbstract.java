package com.rolin.blogapi.entity;


import java.util.Date;

public class ArticleAbstract {
    private int id;
    private int commentCounts; //评论数
    private Date createDate; //创建日期
    private String summary;  //简介
    private String title;    //标题
    private int viewCounts;  //浏览数量
    private int top;         //0-未置顶 1-置顶
    private int authorId;    //作者id
    private int bodyId;      //内容id
    private int categoryId;  //类别id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommentCounts() {
        return commentCounts;
    }

    public void setCommentCounts(int commentCounts) {
        this.commentCounts = commentCounts;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(int viewCounts) {
        this.viewCounts = viewCounts;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getBodyId() {
        return bodyId;
    }

    public void setBodyId(int bodyId) {
        this.bodyId = bodyId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public String toString() {
        return "ArticleAbstract{" +
                "id=" + id +
                ", commentCounts=" + commentCounts +
                ", createDate=" + createDate +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                ", viewCounts=" + viewCounts +
                ", top=" + top +
                ", authorId=" + authorId +
                ", bodyId=" + bodyId +
                ", categoryId=" + categoryId +
                '}';
    }
}
