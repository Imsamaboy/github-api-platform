package com.example.githubclient;

import com.example.githubclient.models.PRComment;
import org.eclipse.egit.github.core.Comment;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.event.DeletePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class GitHubClientController {
    @Autowired
    private GitHubService githubService;

    @GetMapping("/repos")
    public List<Repository> getRepos() throws IOException {
        return githubService.getRepositories();
    }

    @GetMapping("/repos/{owner}/{repo}/pulls")
    public String getPulls(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repoName) throws IOException {
        return githubService.getPullRequests(owner, repoName);
    }

    @GetMapping("/repos/{owner}/{repo}/pulls/{number}/commits")
    public String getPullRequestCommits(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repoName,
            @PathVariable("number") Integer number) throws IOException {
        return githubService.getPullRequestCommits(owner, repoName, number);
    }

    @PostMapping("/repos")
    public Repository createRepo(@RequestBody Repository newRepo) throws IOException {
        return githubService.createRepository(newRepo);
    }

    @PostMapping("/repos/{owner}/{repo}/pulls/{pull_number}/comments")
    public Comment createCommentToPull(@RequestBody Comment newComm,
                                       @PathVariable("owner") String owner,
                                       @PathVariable("repo") String repoName,
                                       @PathVariable("pull_number") Integer number) throws IOException {
        return githubService.createCommentToPullRequest(newComm, owner, repoName, number);
    }


    @PostMapping("/repos/{owner}/{repo}/issues/{issue_number}/comments")
    public Comment createIssueComment(@RequestBody Comment newComm,
                                       @PathVariable("owner") String owner,
                                       @PathVariable("repo") String repoName,
                                       @PathVariable("issue_number") Integer number) throws IOException {
        return githubService.createIssueComment(newComm, owner, repoName, number);
    }

    @PostMapping("/repos/{owner}/{repo}/issues/{issue_number}/comments2")
    public PRComment createIssueComment2(@RequestBody PRComment newComm,
                                      @PathVariable("owner") String owner,
                                      @PathVariable("repo") String repoName,
                                      @PathVariable("issue_number") Integer number) throws IOException {
        return githubService.createIssueComment2(newComm, owner, repoName, number);
    }

//
//    @GetMapping("/comment")
//    public void createCommentToPull() throws IOException {
//        githubService.createCommentToPullRequest();
//    }


    @DeleteMapping("/repos/{owner}/{repo}")
    public DeletePayload deleteRepo(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repoName) throws IOException {
        return githubService.deleteRepository(owner, repoName);
    }
}
