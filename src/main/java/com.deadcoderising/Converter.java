package com.deadcoderising;

import spark.Request;
import spark.Response;

/**
 * User: Marius
 * Date: 17/04/15
 */
public interface Converter {
    public ResponseCreator route(Request req, Response res);
}
