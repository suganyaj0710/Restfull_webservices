package com.Restfullwebservices.Restfull_services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController<location, T> {


    @Autowired
    private UserDaoservice service;

    //retrieve all user
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findall();
    }

    //findone user
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOut(id);
        if(user == null)
            throw new UserNotFoundException("id-"+id);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable int id){
        User user = service.deleteById(id);
        if(user == null)
            throw new UserNotFoundException("id-"+id);
    }

    //@valid - helps to validate the size (@size in user class) of the name in line 47
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        //For retrieving the recently created request id
        //user/{id} savedUser.getId()
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
