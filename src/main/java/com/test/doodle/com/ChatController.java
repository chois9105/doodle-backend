package com.test.doodle.com;

import com.test.doodle.entity.Chat;
import com.test.doodle.repository.ChatDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
public class ChatController {

    @Autowired
    private ChatDAO chatDAO;


    @PostMapping(consumes = "application/json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void sendChat(@RequestBody Chat chat){

        chatDAO.save(chat);

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Object> getChat(){

        return new ResponseEntity<>(chatDAO.findAllByOrderByDateAsc(), HttpStatus.OK);


    }




}
