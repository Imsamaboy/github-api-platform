package com.example.githubclient.models;

import com.google.gson.annotations.SerializedName;
//import org.eclipse.egit.github.core.User;

import java.io.Serializable;
import java.util.Date;

public class Repository implements Serializable {
    @SerializedName("serialVersionUID")
    private static final long serialVersionUID = 406671816413754925L;

    @SerializedName("parent")
    private Repository parent;

    @SerializedName("source")
    private Repository source;

    @SerializedName("fork")
    private boolean fork;

    @SerializedName("hasDownloads")
    private boolean hasDownloads;

    @SerializedName("hasIssues")
    private boolean hasIssues;

    @SerializedName("hasWiki")
    private boolean hasWiki;

    @SerializedName("private")
    private boolean isPrivate;

    @SerializedName("createdAt")
    private Date createdAt;

    @SerializedName("pushedAt")
    private Date pushedAt;

    @SerializedName("updatedAt")
    private Date updatedAt;

    @SerializedName("forks")
    private int forks;

    @SerializedName("id")
    private long id;

    @SerializedName("openIssues")
    private int openIssues;

    @SerializedName("size")
    private int size;

    @SerializedName("watchers")
    private int watchers;

    @SerializedName("clonrUrl")
    private String cloneUrl;

    @SerializedName("description")
    private String description;

    @SerializedName("homepage")
    private String homepage;

    @SerializedName("gitUrl")
    private String gitUrl;

    @SerializedName("htmlUrl")
    private String htmlUrl;

    @SerializedName("language")
    private String language;

    @SerializedName("masterBranch")
    private String masterBranch;

    @SerializedName("mirrorUrl")
    private String mirrorUrl;

    @SerializedName("name")
    private String name;

    @SerializedName("sshUrl")
    private String sshUrl;

    @SerializedName("svnUrl")
    private String svnUrl;

    @SerializedName("url")
    private String url;
//
//    @SerializedName("owner")
//    private User owner;

    public Repository() {
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(Date pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(int openIssues) {
        this.openIssues = openIssues;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    public User getOwner() {
//        return owner;
//    }
//
//    public void setOwner(User owner) {
//        this.owner = owner;
//    }
}
