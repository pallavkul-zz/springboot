package com.bringon.applicant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @RequestMapping("/applicants")
    public List<Applicant> getAllApplicants(){
        return  applicantService.getAllApplicant();
    }

    @RequestMapping("/applicants/{id}")
    public Applicant getApplicant(@PathVariable String id){
        return applicantService.getApplicant(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/applicants")
    public void addApplicant(@RequestBody Applicant applicant){
        applicantService.addApplicant(applicant);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/applicants/{id}")
    public void updateApplicant(@RequestBody Applicant applicant, @PathVariable String id){
        applicantService.updateApplicant(applicant, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/applicants/{id}")
    public void removeApplicant(@PathVariable String id){
        applicantService.removeApplicant(id);
    }

}
