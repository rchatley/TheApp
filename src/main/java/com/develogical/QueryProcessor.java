package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("SPA2012")) {
            return "SPA is relaxing";
        }
        return null;
    }
}
