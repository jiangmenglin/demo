package com.example.demo.jdbc.entity;

import java.io.Serializable;

public class Countrylanguage implements Serializable {
    private String countrycode;

    private String language;

    private String isofficial;

    private Float percentage;

    private static final long serialVersionUID = 1L;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial == null ? null : isofficial.trim();
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countrycode=").append(countrycode);
        sb.append(", language=").append(language);
        sb.append(", isofficial=").append(isofficial);
        sb.append(", percentage=").append(percentage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}