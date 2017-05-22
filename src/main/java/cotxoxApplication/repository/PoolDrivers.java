/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotxoxApplication.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import cotxoxApplication.entity.Driver;

/**
 *
 * @author Sergi
 */
//
public interface PoolDrivers extends JpaRepository<Driver, Serializable> {

}
