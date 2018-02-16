package pl.poznan.uam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:63343")
@RequestMapping("/")
public class Start {
        public String getHomepage() {
            return "index";
        }
    }
