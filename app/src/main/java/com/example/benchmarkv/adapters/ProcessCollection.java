package com.example.benchmarkv.adapters;

public class ProcessCollection {

    String nameOfProcess;
    Boolean indicator;

    public ProcessCollection(String nameOfProcess, Boolean indicator) {
        this.nameOfProcess = nameOfProcess;
        this.indicator = indicator;
    }

    public String getNameOfProcess() {
        return nameOfProcess;
    }

    public void setNameOfProcess(String nameOfProcess) {
        this.nameOfProcess = nameOfProcess;
    }

    public Boolean getIndicator() {
        return indicator;
    }

    public void setIndicator(Boolean indicator) {
        this.indicator = indicator;
    }
}
