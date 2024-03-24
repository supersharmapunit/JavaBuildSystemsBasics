package org.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface TodoService {
    @GET("/todos/{todoId}")
    Call<Todo> getTodoById(@Path("todoId") String todoId);
}
