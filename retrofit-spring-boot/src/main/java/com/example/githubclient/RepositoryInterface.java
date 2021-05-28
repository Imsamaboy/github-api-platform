package com.example.githubclient;

import com.example.githubclient.models.PRComment;
import org.eclipse.egit.github.core.Comment;
import org.eclipse.egit.github.core.Commit;
import org.eclipse.egit.github.core.PullRequest;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.event.DeletePayload;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface RepositoryInterface {
    @GET("user/repos")
    Call<List<Repository>> listRepos(@Header("Authorization") String accessToken,
                                     @Header("Accept") String apiVersionSpec);

    @GET("/repos/{owner}/{repo}/pulls")
    Call<List<PullRequest>> listPulls(@Header("Authorization") String accessToken,
                                      @Header("Accept") String apiVersionSpec,
                                      @Path("owner") String owner,
                                      @Path("repo") String repo);

    @GET("/repos/{owner}/{repo}/commits")
    Call<List<Commit>> listCommits(@Header("Authorization") String accessToken,
                                   @Header("Accept") String apiVersionSpec,
                                   @Path("owner") String owner,
                                   @Path("repo") String repo);

    @GET("/repos/{owner}/{repo}/pulls/{number}/commits")
    Call<List<Commit>> listPullRequestCommits(@Header("Authorization") String accessToken,
                                              @Header("Accept") String apiVersionSpec,
                                              @Path("owner") String owner,
                                              @Path("repo") String repo,
                                              @Path("number") Integer number);

    @DELETE("repos/{owner}/{repo}")
    Call<DeletePayload> deleteRepo(@Header("Authorization") String accessToken,
                                   @Header("Accept") String apiVersionSpec,
                                   @Path("repo") String repo,
                                   @Path("owner") String owner);

    @POST("/repos/{owner}/{repo}/pulls/{pull_number}/comments")
    Call<Comment> addCommentToPullRequest(@Body Comment comm,
                                          @Header("Authorization") String accessToken,
                                          @Header("Accept") String apiVersionSpec,
                                          @Path("repo") String repo,
                                          @Path("owner") String owner,
                                          @Path("pull_number") Integer pull_number);


    @POST("/repos/{owner}/{repo}/issues/{issue_number}/comments")
    Call<Comment> addIssueComment(@Body Comment comm,
                                  @Header("Authorization") String accessToken,
                                  @Header("Accept") String apiVersionSpec,
                                  @Path("owner") String owner,
                                  @Path("repo") String repo,
                                  @Path("issue_number") Integer issue_number);

    @POST("/repos/{owner}/{repo}/issues/{issue_number}/comments")
    Call<PRComment> addIssueComment2(@Body PRComment comm,
                                     @Header("Authorization") String accessToken,
                                     @Header("Accept") String apiVersionSpec,
                                     @Path("owner") String owner,
                                     @Path("repo") String repo,
                                     @Path("issue_number") Integer issue_number);



    @POST("user/repos")
    Call<Repository> createRepo(@Body Repository repo,
                                @Header("Authorization") String accessToken,
                                @Header("Accept") String apiVersionSpec,
                                @Header("Content-Type") String contentType);
}