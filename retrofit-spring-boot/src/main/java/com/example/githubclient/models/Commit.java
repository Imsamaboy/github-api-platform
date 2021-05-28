package com.example.githubclient.models;

import com.google.gson.annotations.SerializedName;
//import org.eclipse.egit.github.core.CommitUser;
//import org.eclipse.egit.github.core.Tree;
import java.io.Serializable;

public class Commit implements Serializable {
    @SerializedName("message")
    private String message;
    @SerializedName("commit")
    private Commit node;

    public Commit() {
    }

    public String getMessage() {
        return this.message;
    }
    public String getNodeMessage() {
        return node.getMessage();
    }
    public void setNodeMessage(String message) {
        node.setMessage(message);
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
