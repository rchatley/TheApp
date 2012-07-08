package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("York")) {
            return "York is a walled city, situated at the confluence of the Rivers Ouse and Foss.";
        }
        return null;
    }
}
