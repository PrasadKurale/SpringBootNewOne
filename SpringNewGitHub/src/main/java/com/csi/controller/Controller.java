package com.csi.controller;


import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api")

    public class Controller
    {

        @GetMapping()
        //THIS IS MY FIRST CLASS
        public String sayService()
        {
            return "This is my first class";
        }




}
