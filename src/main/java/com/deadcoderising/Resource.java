package com.deadcoderising;

public class Resource {
    public ResponseCreator get(String id) {

        // parse JSON, do validation, fetch data, etc

        return MyResponse.ok("{\"some\": \"json\"}");
    }

    public ResponseCreator getList() {

        // parse JSON, do validation, fetch data, etc

        return MyResponse.ok("{\"some\": \"json\"}");
    }

    public ResponseCreator create(String body) {

        // parse JSON, do validation, create, fetch data, etc

        return MyResponse.ok("{\"some\": \"json\"}");
    }
}
