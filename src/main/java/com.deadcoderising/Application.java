package com.deadcoderising;

import spark.Route;
import spark.servlet.SparkApplication;

import static spark.Spark.get;
import static spark.Spark.post;

public class Application implements SparkApplication {

    private final Resource resource;

    public Application(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void init() {
        post("/", map((req, res) -> resource.create(req.body())));
        get("/", map((req, res) -> resource.getList()));
        get("/:id", map((req, res) -> resource.get(req.params(":id"))));
    }

    Route map(Converter converter) {
        return (req, res) -> converter.route(req, res).handle(req,res);
    }
}
