package com.homehelper.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homehelper.service.Model.Project_model;
import com.homehelper.service.Repository.HelperRepository;

@Service
public class ProjectService {
    @Autowired
    private HelperRepository helperRepository;
    public Project_model savedata(Project_model model){
        return helperRepository.save(model);
    }
    public Project_model get_project_id(int id){
        return helperRepository.findById(id).orElse(null);
    }
    public List<Project_model>getAlldata()
    {
        return helperRepository.findAll();
    }
    public void deletedata(int id){
        helperRepository.deleteById(id);
    }
    public Object get_pid(int project_id) {
        throw new UnsupportedOperationException("Unimplemented method 'get_pid'");
    }
}


