package com.example.SpringBootDemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {
    private final List<Message> message= new ArrayList<>();

    @GetMapping("/messages")
    public List<Message> getMessage() {
        return message;
    }

    @PostMapping("/messages")
    public void addMessage(@RequestBody Message message) {
        this.message.add(message);

    }
}
