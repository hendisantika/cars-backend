package id.my.hendisantika.carsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : cars-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/07/24
 * Time: 08.44
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarSearchParameters {
    private String maker;
    private String model;
    private Integer year;
    private Integer yearFrom;
    private Integer yearTo;
    private Integer odometerFrom;
    private Integer odometerTo;
    private String vehicleCondition;
    private String states;
    private Date customDate;// eg. last 7 days
    private String saleCategory;
    private String badges;
    private String bodyType;
    private String bodyTypeConfig;
    private String fuelType;
    private String transmission;
    private String engine;
    private Integer cylinders;
    private String division;
    private String drive;
    private Integer seat;
    private Integer doors;
    private String description;
    private String sort;
    private String asc;
}
