package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("Imperial")) {
            return "a university in london";
        }
        return null;
    }
}
