package org.example.controllers;

import org.example.UserMapper;
import org.example.entities.User;
import org.example.UserCommand;

public class UserControllers {
    User saveUser (UserCommand command){
        //Implementacion falsa
        //return new User();
        return UserMapper.INSTANCE.userComandToUser(command);
    }
}
