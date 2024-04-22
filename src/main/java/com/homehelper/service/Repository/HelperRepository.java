package com.homehelper.service.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homehelper.service.Model.Project_model;


@Repository
public interface HelperRepository extends JpaRepository<Project_model,Integer> {

}