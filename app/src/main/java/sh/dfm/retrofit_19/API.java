package sh.dfm.retrofit_19;


/*
*Описание запросов к серверу происходит в интерфейсе.
* Над каждым методом должна стоять аннотация, с помощью которой Retrofit «узнает», какого типа запрос.
*Также с помощью аннотаций можно указывать параметры запроса.
 */

import retrofit.Callback;
import retrofit.http.*;

public interface API {


    @GET("/users/{user}")
    void getUserInfo(@Path("user") String userName, Callback<Response> cb);

    @FormUrlEncoded
    @POST("/todo.html")
    Response saveUserInfo(@Field("login") String userName, @Field("password") String userPass);
    //////////////////////////

    //Вот так, например, выглядит описание GET-запроса:
    @GET("/todo.html")
    Response getUsers();

    //А вот так выглядит POST-запрос:
    @POST("/v1/registration")
    Response registerUser();

    //Можно изменять путь к файлу динамически:
    @GET("/{version}/users")
    Response getUsers(@Path("version") String version);



/*    Для того, чтобы задать запросу параметры используется аннотация @Query.
Слово указанное в скобках рядом с аннотацией будет ключом, а аннотированый аргумент значением.

    @GET("/v1/users")
    Response getUsers(@Query("gender") String gender);
    */

}
