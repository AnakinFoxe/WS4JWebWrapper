package edu.cpp.iipl.ws4jweb_wrapper.model;

import java.util.List;

/**
 * Created by xing on 1/13/16.
 */
public class Response {
    private List<Result> result;
    private String measure;

    public List<Result> getResult() {
        return result;
    }

    public String getMeasure() {
        return measure;
    }
}
