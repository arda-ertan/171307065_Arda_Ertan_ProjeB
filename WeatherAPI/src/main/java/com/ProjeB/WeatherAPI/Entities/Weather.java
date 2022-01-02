package com.ProjeB.WeatherAPI.Entities;

import javax.persistence.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Entity
@Table(name="weathers")
public class Weather {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="city_name")
    private String cityName;
    @Column(name="country")
    private String country;
    @Column(name="temp")
    private double temp;
    @Column(name="max_temp")
    private double maxTemp;
    @Column(name="min_temp")
    private double minTemp;
    @Column(name="state")
    private String state;
    @Column(name="date")
    private Date date;



    public Weather(String cityName, String country, double temp, double maxTemp, double minTemp, String state, Date date) {

        this.cityName = cityName;
        this.country = country;
        this.temp = temp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.state = state;
        this.date = date;
    }
    public Weather(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", country='" + country + '\'' +
                ", temp=" + temp +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", state='" + state + '\'' +
                ", date=" + date +
                '}';
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
