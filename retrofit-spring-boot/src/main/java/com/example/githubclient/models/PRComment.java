package com.example.githubclient.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PRComment implements Serializable {
    @SerializedName("body")
    private String body;
    @SerializedName("commitID")
    private String commitID;
    @SerializedName("path")
    private String path;
    @SerializedName("position")
    private Integer position;
    @SerializedName("side")
    private String side;
    @SerializedName("line")
    private int line;
    @SerializedName("startLine")
    private int startLine;
    @SerializedName("startSide")
    private String startSide;
    @SerializedName("inReplyTo")
    private int inReplyTo;

    public PRComment() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCommitID() {
        return commitID;
    }

    public void setCommitID(String commitID) {
        this.commitID = commitID;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getStartLine() {
        return startLine;
    }

    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public String getStartSide() {
        return startSide;
    }

    public void setStartSide(String startSide) {
        this.startSide = startSide;
    }

    public int getInReplyTo() {
        return inReplyTo;
    }

    public void setInReplyTo(int inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    public static class Builder {
    private final PRComment comment;

    public Builder() {
        comment = new PRComment();
    }

    public Builder withBody(String body) {
        comment.body = body;
        return this;
    }

    public Builder withCommitID(String commitID) {
        comment.commitID = commitID;
        return this;
    }

    public Builder withPath(String path) {
        comment.path = path;
        return this;
    }

    public Builder withPosition(Integer position) {
        comment.position = position;
        return this;
    }

    public Builder withSide(String side) {
        comment.side = side;
        return this;
    }

    public Builder withLine(int line) {
        comment.line = line;
        return this;
    }

    public Builder withStartLine(int start_line) {
        comment.startLine = start_line;
        return this;
    }

    public Builder withStartSide(String startSide) {
        comment.startSide = startSide;
        return this;
    }

    public Builder withInReplyTo(int inReplyTo) {
        comment.inReplyTo = inReplyTo;
        return this;
    }

    public PRComment build() {
        return comment;
    }
    }
}
