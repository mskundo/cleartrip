package com.example.cleartrip.models;

import java.util.ArrayList;
import java.util.List;

public class ActivationKeyword {

    private List<String> keywords;

    public List<String> getKeywords() {
        List<String> list = new ArrayList<>();
        list.add("OK Google");
        return list;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
