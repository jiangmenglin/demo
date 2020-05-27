package com.example.demo.jdbc.entity;

import java.io.Serializable;

public class Country implements Serializable {
    private String code;

    private String name;

    private String continent;

    private String region;

    private Float surfacearea;

    private Short indepyear;

    private Integer population;

    private Float lifeexpectancy;

    private Float gnp;

    private Float gnpold;

    private String localname;

    private String governmentform;

    private String headofstate;

    private Integer capital;

    private String code2;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Float getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(Float surfacearea) {
        this.surfacearea = surfacearea;
    }

    public Short getIndepyear() {
        return indepyear;
    }

    public void setIndepyear(Short indepyear) {
        this.indepyear = indepyear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Float getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(Float lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    public Float getGnp() {
        return gnp;
    }

    public void setGnp(Float gnp) {
        this.gnp = gnp;
    }

    public Float getGnpold() {
        return gnpold;
    }

    public void setGnpold(Float gnpold) {
        this.gnpold = gnpold;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname == null ? null : localname.trim();
    }

    public String getGovernmentform() {
        return governmentform;
    }

    public void setGovernmentform(String governmentform) {
        this.governmentform = governmentform == null ? null : governmentform.trim();
    }

    public String getHeadofstate() {
        return headofstate;
    }

    public void setHeadofstate(String headofstate) {
        this.headofstate = headofstate == null ? null : headofstate.trim();
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2 == null ? null : code2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", continent=").append(continent);
        sb.append(", region=").append(region);
        sb.append(", surfacearea=").append(surfacearea);
        sb.append(", indepyear=").append(indepyear);
        sb.append(", population=").append(population);
        sb.append(", lifeexpectancy=").append(lifeexpectancy);
        sb.append(", gnp=").append(gnp);
        sb.append(", gnpold=").append(gnpold);
        sb.append(", localname=").append(localname);
        sb.append(", governmentform=").append(governmentform);
        sb.append(", headofstate=").append(headofstate);
        sb.append(", capital=").append(capital);
        sb.append(", code2=").append(code2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}