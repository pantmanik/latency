package com.samsung.latency.controller;

import com.samsung.latency.service.LatencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LatencyController {
    @Autowired
    private LatencyService latencyService;

    @GetMapping("/route1")
    public Boolean route1(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(1, requestBody);
    }

    @GetMapping("/route2")
    public Boolean route2(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(2, requestBody);
    }

    @GetMapping("/route3")
    public Boolean route3(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(3, requestBody);
    }

    @GetMapping("/route4")
    public Boolean route4(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(4, requestBody);
    }

    @GetMapping("/route5")
    public Boolean route5(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(5, requestBody);
    }

    @GetMapping("/route6")
    public Boolean route6(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(6, requestBody);
    }

    @GetMapping("/route7")
    public Boolean route7(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(7, requestBody);
    }

    @GetMapping("/route8")
    public Boolean route8(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(8, requestBody);
    }

    @GetMapping("/route9")
    public Boolean route9(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(9, requestBody);
    }

    @GetMapping("/route10")
    public Boolean route10(@RequestBody(required = false) Object requestBody) {
        return latencyService.executeModel(10, requestBody);
    }

}
