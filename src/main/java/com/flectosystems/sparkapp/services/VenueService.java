package com.flectosystems.sparkapp.services;

import static spark.Spark.get;
import spark.servlet.SparkApplication;

import com.flectosystems.sparkapp.models.Venue;
import com.flectosystems.sparkapp.models.JsonTransformer;

public class VenueService implements SparkApplication {

    @Override
    public void init() {
        get("/api/venue", "application/json", (req, res) -> {
            Venue v = new Venue(15.3, 12.0);

            return v;
        },
        new JsonTransformer()
           );
    }
}