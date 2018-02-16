package pl.poznan.uam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Start {
        public String getHomepage() {
            return "index";
        }
    }
