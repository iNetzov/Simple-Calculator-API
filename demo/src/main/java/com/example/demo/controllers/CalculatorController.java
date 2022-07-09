package com.example.demo.controllers;

import com.example.demo.enitity.NumberDTO;
import com.example.demo.enitity.RequestParamsDTO;
import com.example.demo.services.mapper.NumberMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    private final NumberMapper numberMapper;

    public CalculatorController(NumberMapper numberMapper) {
        this.numberMapper = numberMapper;
    }

    @GetMapping("plus")
    public Integer positiveController(@RequestBody RequestParamsDTO param){
        NumberDTO numberDTO = numberMapper.requestParamToNumberDTO(param);
        return 1;

    }

}
