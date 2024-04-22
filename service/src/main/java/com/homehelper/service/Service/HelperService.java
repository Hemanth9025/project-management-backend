package com.homehelper.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homehelper.service.Model.DecorModel;
import com.homehelper.service.Repository.DecorRepository;

@Service
public class HelperService {
    @Autowired
    private DecorRepository helperRepository;
    public DecorModel savedata(DecorModel model){
        return helperRepository.save(model);
    }
    public DecorModel get_sno(int decor_id){
        return helperRepository.findById(decor_id).orElse(null);
    }
    public List<DecorModel>getAlldata()
    {
        return helperRepository.findAll();
    }
    public void deletedata(int decor_id){
        helperRepository.deleteById(decor_id);
    }
}


