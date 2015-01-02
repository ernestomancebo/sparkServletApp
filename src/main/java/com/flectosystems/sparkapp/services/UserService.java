package com.flectosystems.sparkapp.services;

import static spark.Spark.get;
import spark.servlet.SparkApplication;

import com.flectosystems.sparkapp.models.User;

public class UserService implements SparkApplication {

    @Override
    public void init() {
        get("/api/user", (req, res) -> {
            User u = new User("Ernesto", "ernesto@mail.com");

            return u.toString();
        });
    }
}