package com.example.springboot_3_filters;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filters")
public class DemoController {

    private DemoService demoService;

    DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    public ResponseEntity<ResponseDto> getMethodName() {
        return ResponseEntity.ok(new ResponseDto(demoService.sayHello()));
    }
    


}
