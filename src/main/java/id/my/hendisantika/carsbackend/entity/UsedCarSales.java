package id.my.hendisantika.carsbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : cars-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/07/24
 * Time: 08.36
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "used_car_sales")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsedCarSales {
    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "make", length = 20)
    private String make;

    @Column(name = "model", length = 20)
    private String model;

    @Column(name = "year")
    private Integer year;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "odometer")
    private Integer odometer;

    @Column(name = "vehicle_condition", length = 20)
    private String vehicleCondition;

    @Column(name = "sale_location", length = 32)
    private String saleLocation;

    @Column(name = "sale_category", length = 100)
    private String saleCategory;

    @Column(name = "salvage_vehicle", length = 3)
    private String salvageVehicle;

    @Column(name = "sale_date")
    private Date saleDate;

    @Column(name = "sale_price", precision = 10, scale = 2)
    private BigDecimal salePrice;

    @Column(name = "colour", length = 10)
    private String colour;

    @Column(name = "engine", length = 32)
    private String engine;

    @Column(name = "transmission", length = 100)
    private String transmission;

    @Column(name = "accessories", length = 32)
    private String accessories;

    @Column(name = "states", length = 10)
    private String states;

    @Column(name = "custom_date")
    private Integer customDate;

    @Column(name = "badges", length = 20)
    private String badges;

    @Column(name = "body_type", length = 10)
    private String bodyType;

    @Column(name = "body_type_config", length = 20)
    private String bodyTypeConfig;

    @Column(name = "fuel_type", length = 6)
    private String fuelType;

    @Column(name = "cylinders")
    private Integer cylinders;

    @Column(name = "division", length = 20)
    private String division;

    @Column(name = "drive", length = 20)
    private String drive;

    @Column(name = "seat")
    private Integer seat;

    @Column(name = "doors")
    private Integer doors;

}
