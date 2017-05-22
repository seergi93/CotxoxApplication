/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotxox.application.controller;

import cotxox.application.entity.Driver;
import cotxox.application.repository.PoolDrivers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sergi
 */
@RestController
@RequestMapping("/test")
public class DriverController {

    private final PoolDrivers poolDrivers;

    @Autowired
    public DriverController(PoolDrivers poolDrivers) {
        this.poolDrivers = poolDrivers;
    }

    @GetMapping
    public List<Driver> listDrivers() {
        
        return poolDrivers.findAll();

    }

}
