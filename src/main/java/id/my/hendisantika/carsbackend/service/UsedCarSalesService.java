package id.my.hendisantika.carsbackend.service;

import id.my.hendisantika.carsbackend.entity.UsedCarSales;
import id.my.hendisantika.carsbackend.model.CarSearchParameters;
import id.my.hendisantika.carsbackend.repository.UsedCarSalesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : cars-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/07/24
 * Time: 08.53
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UsedCarSalesService {

    private final UsedCarSalesRepository usedCarSalesRepository;

    public List<UsedCarSales> findByParameter(CarSearchParameters carSearchParameters) {
        return usedCarSalesRepository.findByParameter(carSearchParameters);
    }
}
