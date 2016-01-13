package edu.cpp.iipl.ws4jweb_wrapper.model;

/**
 * Created by xing on 1/13/16.
 */
public class Result {
    private int input1_num;     // total number of synsets
    private int input2_num;
    private String input1;
    private String input2;
    private double score;
    private double time;

    public int getInput1_num() {
        return input1_num;
    }

    public int getInput2_num() {
        return input2_num;
    }

    public String getInput1() {
        return input1;
    }

    public String getInput2() {
        return input2;
    }

    public double getScore() {
        return score;
    }

    public double getTime() {
        return time;
    }
}
