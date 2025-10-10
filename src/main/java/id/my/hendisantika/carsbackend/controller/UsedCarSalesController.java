package id.my.hendisantika.carsbackend.controller;

import id.my.hendisantika.carsbackend.model.CarSearchParameters;
import id.my.hendisantika.carsbackend.model.Response;
import id.my.hendisantika.carsbackend.model.ResponseMessage;
import id.my.hendisantika.carsbackend.model.ResponseStatus;
import id.my.hendisantika.carsbackend.service.UsedCarSalesService;
import id.my.hendisantika.carsbackend.util.CarSearchParametersUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : cars-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/07/24
 * Time: 08.54
 * To change this template use File | Settings | File Templates.
 */
@RestController
@CrossOrigin
@RequestMapping("/cars")
@RequiredArgsConstructor
public class UsedCarSalesController {

    private final UsedCarSalesService usedCarSalesService;

    @GetMapping
    public Response getCars(
            @RequestParam(required = false) String maker,
            @RequestParam(required = false) String model,
            @RequestParam(required = false) String year,
            @RequestParam(required = false) String odometer,
            @RequestParam(required = false) String vehicleCondition,
            @RequestParam(required = false) String states,
            @RequestParam(required = false) String customDate,
            @RequestParam(required = false) String saleCategory,
            @RequestParam(required = false) String badges,
            @RequestParam(required = false) String bodyType,
            @RequestParam(required = false) String bodyTypeConfig,
            @RequestParam(required = false) String fuelType,
            @RequestParam(required = false) String transmission,
            @RequestParam(required = false) String engine,
            @RequestParam(required = false) String cylinders,
            @RequestParam(required = false) String division,
            @RequestParam(required = false) String drive,
            @RequestParam(required = false) String seat,
            @RequestParam(required = false) String doors,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String sort,
            @RequestParam(required = false) String asc) {

        try {
            CarSearchParameters carSearchParameters = CarSearchParametersUtil.AssembleCarSearchParameters(maker, model, year,
                    odometer, vehicleCondition, states, customDate, saleCategory,
                    badges, bodyType, bodyTypeConfig, fuelType, transmission, engine, cylinders, division,
                    drive, seat, doors, description, sort, asc);

            System.out.println(carSearchParameters);

            return new Response(ResponseStatus.SUCCESS, ResponseMessage.SUCCESS,
                    usedCarSalesService.findByParameter(carSearchParameters));
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseStatus.FAIL, ResponseMessage.ERROR, null);
        }
    }
}
