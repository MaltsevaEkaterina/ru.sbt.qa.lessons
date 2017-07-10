package ru.sbt.lessons2;


import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Мрр on 10.07.2017.
 */
public class Calc {
    public void request(String body, String post){
       Response response = given()
                .body(body)
                .post(post);
        response.then().log().all();
    }
}
