package sh.dfm.retrofit_19;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {

    @SerializedName("todos")
    @Expose
    private List<Todo> todos = null;

    /**
     *
     * @return
     * The todos
     */
    public List<Todo> getTodos() {
        return todos;
    }

    /**
     *
     * @param todos
     * The todos
     */
    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

}