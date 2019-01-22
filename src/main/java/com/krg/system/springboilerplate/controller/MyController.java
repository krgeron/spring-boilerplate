package com.krg.system.springboilerplate.controller;

import com.krg.system.springboilerplate.model.MyModel;
import com.krg.system.springboilerplate.repository.MyRepository;
import com.krg.system.springboilerplate.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private MyRepository myRepository;

    @GetMapping("/hello")
    public ResponseEntity<String> getRequestHello() {
        return new ResponseEntity<String>("Hello", HttpStatus.OK);
    }

    @GetMapping("/model/{name}")
    public ResponseEntity<String> getRequestModel(@PathVariable final String name) {
        final List<MyModel> myModelList = myRepository.findAllByName(name);
        final String responseBody = JsonUtils.convertObjectToString(myModelList);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @PostMapping("/model")
    public ResponseEntity<String> postRequestModel(@RequestBody final MyModel myModelReq) {
        ResponseEntity<String> resp = null;
        if(myModelReq != null) {
            myRepository.save(myModelReq);
            resp = new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return resp;
    }

}