package com.homehelper.service.Controller;
import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.homehelper.service.Model.Project_model;
import com.homehelper.service.Service.ProjectService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    
    @PostMapping("addproject")
    public String addProject(@RequestBody Project_model model) {
        projectService.savedata(model);
        return "Project added successfully";
    }
            
    @GetMapping("/getdata")
    public List<Project_model> getAllProjects() {
        return projectService.getAlldata();
    }
       
    @DeleteMapping("deletedata/{id}")
    public String deleteProject(@PathVariable("id") int project_id){
        if(projectService.get_project_id(project_id) != null){
            projectService.deletedata(project_id);
            return "Project deleted successfully";
        }
        return "No project found with the given ID";
    }
    
    @PutMapping("/updatedate/{id}")
    public String updateData(@PathVariable int id, @RequestBody Project_model newData) {
        Project_model oldData = projectService.get_project_id(id);
        if(oldData != null) {
            if (newData.getProject_title() != null) {
                oldData.setProject_title(newData.getProject_title());
            }
            if (newData.getTeam_leader() != null) {
                oldData.setTeam_leader(newData.getTeam_leader());
            }
            if (newData.getMember1_name() != null) {
                oldData.setMember1_name(newData.getMember1_name());
            }
            if (newData.getMember2_name() != null) {
                oldData.setMember2_name(newData.getMember2_name());
            }
            if (newData.getStart_date() != null) {
                oldData.setStart_date(newData.getStart_date());
            }
            if (newData.getEnd_date() != null) {
                oldData.setEnd_date(newData.getEnd_date());
            }
    
            projectService.savedata(oldData);
            return "Data Updated Successfully";
        }
        return "No project found";
    }
}    