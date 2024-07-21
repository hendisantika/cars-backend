package id.my.hendisantika.carsbackend.controller;

import id.my.hendisantika.carsbackend.service.UsedCarSalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/car")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UsedCarSalesController {

    public final UsedCarSalesService usedCarSalesService;
}
