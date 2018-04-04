package com.allstate.us;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KenController {
    @RequestMapping("/request")
    public ResponseEntity<String> myResponse() {
        return new ResponseEntity<>("Ken is here.", HttpStatus.ACCEPTED);
    }
}
