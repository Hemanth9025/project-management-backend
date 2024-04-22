package com.homehelper.service.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Project_model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int project_id;
    private String project_title;
    private String team_leader;
    private String member1_name;
    private String member2_name;
    private String start_date;
    private String End_date;  
}