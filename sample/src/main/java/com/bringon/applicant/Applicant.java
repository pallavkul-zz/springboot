package com.bringon.applicant;

public class Applicant {


    private String id;
    private String name;
    private String companyName;
    private String title;
    private float totalExperience;
    private String resumePath;

    public Applicant(){

    }

    public Applicant(String id, String name, String companyName, String title, float totalExperience, String resumePath) {
        super();
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.title = title;
        this.totalExperience = totalExperience;
        this.resumePath = this.getId() + resumePath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(float totalExperience) {
        this.totalExperience = totalExperience;
    }

    public String getResumePath() {
        return resumePath;
    }

    public void setResumePath(String resumePath) {
        this.resumePath = this.id + resumePath;
    }

}
