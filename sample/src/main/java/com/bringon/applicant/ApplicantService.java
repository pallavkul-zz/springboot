package com.bringon.applicant;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApplicantService {

    private Applicant applicatnt1 = new Applicant("1", "Pallav Kulshreshtha", "Hortonworks", "SMTS", 12, "Sample Resume");
    private Applicant applicatnt2 = new Applicant("2", "Pranav Kulshreshtha", "HCL", "Lead Test Engineer", 5, "Sample Resume");
    private Applicant applicatnt3 = new Applicant("3", "Subhrata Kulshreshtha", "Appnomic", "Product Manager", 10, "Sample Resume");
    private Applicant applicatnt4 = new Applicant("4", "Avi Kant", "Ajile Labs", "Software Engineer", 2, "Sample Resume");

    private List<Applicant> applicants = new ArrayList<>(Arrays.asList(applicatnt1, applicatnt2, applicatnt3, applicatnt4));

    public List<Applicant> getAllApplicant(){
        return applicants;
    }

    public Applicant getApplicant(String id){
       return applicants.stream().filter(a -> a.getId().equals(id)).findFirst().get();
    }

    public void addApplicant(Applicant applicant){
        applicants.add(applicant);
    }

    public void removeApplicant(String id) {
        applicants.remove(applicants.stream().filter(a -> a.getId().equals(id)).findFirst().get());
    }

    public void updateApplicant(Applicant applicant, String id) {

        for(int i=0; i < applicants.size(); i++){

           Applicant a = applicants.get(i);
           if(a.getId().equals(id)){
               applicants.set(i, applicant);
               return;
           }
        }


    }
}

