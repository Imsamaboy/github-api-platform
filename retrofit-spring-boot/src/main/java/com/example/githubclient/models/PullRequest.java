package com.example.githubclient.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class PullRequest implements Serializable {
    @SerializedName("mergeable")
    private boolean mergeable;
    @SerializedName("merged")
    private boolean merged;
    @SerializedName("closedAt")
    private Date closedAt;
    @SerializedName("mergerAt")
    private Date mergedAt;
    @SerializedName("updatedAt")
    private Date updatedAt;
    @SerializedName("createdAt")
    private Date createdAt;
    @SerializedName("id")
    private long id;
    @SerializedName("additions")
    private int additions;
    @SerializedName("changedFiles")
    private int changedFiles;
    @SerializedName("comments")
    private int comments;
    @SerializedName("commits")
    private int commits;
    @SerializedName("deletions")
    private int deletions;
    @SerializedName("deletions")
    private int number;

    //    private Milestone milestone;
//
//    private PullRequestMarker base;
//
//    private PullRequestMarker head;
    @SerializedName("body")
    private String body;
    @SerializedName("bodyHtml")
    private String bodyHtml;
    @SerializedName("bodyText")
    private String bodyText;
    @SerializedName("diffUrl")
    private String diffUrl;
    @SerializedName("htmlUrl")
    private String htmlUrl;
    @SerializedName("issueUrl")
    private String issueUrl;
    @SerializedName("patchUrl")
    private String patchUrl;
    @SerializedName("state")
    private String state;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;

//    private User assignee;
//
//    private User mergedBy;
//
//    private User user;


    public PullRequest() {
    }

    public boolean isMergeable() {
        return mergeable;
    }

    public void setMergeable(boolean mergeable) {
        this.mergeable = mergeable;
    }

    public boolean isMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public Date getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(Date mergedAt) {
        this.mergedAt = mergedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAdditions() {
        return additions;
    }

    public void setAdditions(int additions) {
        this.additions = additions;
    }

    public int getChangedFiles() {
        return changedFiles;
    }

    public void setChangedFiles(int changedFiles) {
        this.changedFiles = changedFiles;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    public int getDeletions() {
        return deletions;
    }

    public void setDeletions(int deletions) {
        this.deletions = deletions;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public String getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    public String getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
