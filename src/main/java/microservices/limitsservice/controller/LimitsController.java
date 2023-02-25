package microservices.limitsservice.controller;

import microservices.limitsservice.bean.Limits;
import microservices.limitsservice.configuration.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ObjectInputFilter;
import java.util.List;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration limitsConfiguration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(limitsConfiguration.getMinimum(),limitsConfiguration.getMaximum());
    }
}
