package com.homehelper.service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homehelper.service.Model.DecorModel;
import com.homehelper.service.Service.HelperService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class DecorController {
    @Autowired
    private HelperService helperService;
    @PostMapping("adddata")
        public String postdecor(@RequestBody DecorModel model) {
        helperService.savedata(model);
        return "Helper added successfully";
    }

    @GetMapping("/getdata")
    public List<DecorModel> ViewAllInfo() {
        return helperService.getAlldata();
    }

    @DeleteMapping("deletedata/{decor_id}")
    public String deleteAccount(@PathVariable("decor_id") int decor_id){
        if(helperService.get_sno(decor_id) != null){
            helperService.deletedata(decor_id);
            return "Deleted successfully";
        }
        return "No data found";
    }
    @PutMapping("/updatecolor/{decor_id}/{color}")
    public String updatecolor(@PathVariable int decor_id,@PathVariable String color) {
        DecorModel olddata = helperService.get_sno(decor_id);
        if(olddata!=null){
            olddata.setColor(color);
            helperService.savedata(olddata);
            return "Data Updated Successfully";
        }
        return "No data found";
    }
    @PutMapping("/updatequantity/{decor_id}/{quantity_available}")
    public String updatequantity(@PathVariable int decor_id,@PathVariable int quantity_available) {
        DecorModel olddata = helperService.get_sno(decor_id);
        if(olddata!=null){
            olddata.setQuantity_available(quantity_available);
            helperService.savedata(olddata);
            return "Data Updated Successfully";
        }
        return "No data found";
    }
    @PutMapping("/updateprice/{decor_id}/{price}")
    public String updateprice(@PathVariable int decor_id,@PathVariable int price) {
        DecorModel olddata = helperService.get_sno(decor_id);
        if(olddata!=null){
            olddata.setPrice(price);
            helperService.savedata(olddata);
            return "Data Updated Successfully";
        }
        return "No data found";
    }
    @PutMapping("/updateitem/{decor_id}/{item_name}")
    public String updateitem(@PathVariable int decor_id,@PathVariable String item_name) {
        DecorModel olddata = helperService.get_sno(decor_id);
        if(olddata!=null){
            olddata.setItem_name(item_name);
            helperService.savedata(olddata);
            return "Data Updated Successfully";
        }
        return "No data found";
    }
    @PutMapping("/updatecategory/{decor_id}/{category}")
    public String updatecategory(@PathVariable int decor_id,@PathVariable String category) {
        DecorModel olddata = helperService.get_sno(decor_id);
        if(olddata!=null){
            olddata.setCategory(category);
            helperService.savedata(olddata);
            return "Data Updated Successfully";
        }
        return "No data found";
    }
    
}