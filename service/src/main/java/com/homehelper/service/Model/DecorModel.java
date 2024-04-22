package com.homehelper.service.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DecorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int decor_id;
    private String item_name;
    private String category;
    private int price;
    private String color;
    private int quantity_available;
   
}
