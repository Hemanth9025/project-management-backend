package com.homehelper.service.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homehelper.service.Model.DecorModel;


@Repository
public interface DecorRepository extends JpaRepository<DecorModel,Integer> {

}