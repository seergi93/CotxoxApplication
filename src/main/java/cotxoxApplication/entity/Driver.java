/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotxox.application.entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author Sergi
 */
@Entity
@Table(name = "Driver")
public class Driver implements Serializable {

    // ---------- Variables ----------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id = null;
    @Column(name = "name")
    private String name = null;
    @Column(name = "model")
    private String model = null;
    @Column(name = "registration")
    private String registration = null;
    @Column(name = "valuation")
    private double Valuation = 0;
    private ArrayList<Integer> Valuations = new ArrayList<>();
    @Column(name = "available")
    private Boolean available = true;

    // ---------- Constructors ----------
    public Driver(String name) {
        this.name = name;
    }

    // ---------- Setters & Getters ----------
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the registration
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * @param registration the registration to set
     */
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    /**
     * @return the Valuation
     */
    public double getValuation() {
        return Valuation;
    }

    /**
     * @param Valuation the Valuation to set
     */
    public void setValuation(double Valuation) {
        this.Valuation = Valuation;
    }

    /**
     * @return the Valuations
     */
    public ArrayList<Integer> getValuations() {
        return Valuations;
    }

    /**
     * @param Valuations the Valuations to set
     */
    public void setValuations(ArrayList<Integer> Valuations) {
        this.Valuations = Valuations;
    }

    /**
     * @return the available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    // ---------- Métodos ----------
    public void setValoracion(Integer value) {
        getValuations().add(value);
        double totalValuation = 0;
        for (Integer valuations : getValuations()) {
            totalValuation += value;
        }
        setValuation(totalValuation / getValuations().size());
    }

}
