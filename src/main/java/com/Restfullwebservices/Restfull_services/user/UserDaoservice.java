package com.Restfullwebservices.Restfull_services.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoservice {
    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1, "suganya", new Date()));
        users.add(new User(2, "dhina", new Date()));
        users.add(new User(3, "pranavisri", new Date()));
    }
/*
Retrieve all Users - GET / users
Create a user - POST / users
retrieve one user - GET / users/{id}
delete a user -  DELETE / users/{id}

Retrieve all posts for a user -  GET/users/{id}/posts
create a posts for a user - POST/ users/{id}/posts
retrieve details of a post - GET/users/{id}/posts/{post_id}

 */
    //user find all
    private static int usersCount =3;
    public List<User> findall(){
        return users;
    }

    public User save(User user){
        if(user.getId() == 0){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOut(int id){
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
