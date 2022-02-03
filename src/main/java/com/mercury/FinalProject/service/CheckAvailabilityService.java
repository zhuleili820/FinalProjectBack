package com.mercury.FinalProject.service;
import com.mercury.FinalProject.bean.CheckAvailability;
import com.mercury.FinalProject.dao.CheckAvailabilityDao;
import com.mercury.FinalProject.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CheckAvailabilityService {

    @Autowired
    private CheckAvailabilityDao checkAvailabilityDao;

    public Response save(CheckAvailability checkAvailability){
        try{
            checkAvailabilityDao.save(checkAvailability);
            System.out.println("success");
            return new Response(true);
        }
        catch (Exception e){
            System.out.println(e);
            return new Response(false);
        }
    }

    public CheckAvailability getCheckAvailabilityById(Integer id){
        return checkAvailabilityDao.findById(id).get();
    }

    public List<CheckAvailability> getAll(){
        return checkAvailabilityDao.findAll();
    }

    public CheckAvailability editStatus (CheckAvailability checkAvailability){
        CheckAvailability es = checkAvailabilityDao.findById(checkAvailability.getId()).get();
        es = checkAvailability;

        return checkAvailabilityDao.save(es);
    }



}


