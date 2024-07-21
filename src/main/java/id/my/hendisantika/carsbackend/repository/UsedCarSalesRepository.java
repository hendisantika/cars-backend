package id.my.hendisantika.carsbackend.repository;

import id.my.hendisantika.carsbackend.entity.UsedCarSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : cars-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/07/24
 * Time: 08.48
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UsedCarSalesRepository extends JpaRepository<UsedCarSales, Long>,
        JpaSpecificationExecutor<UsedCarSales> { // Added JpaSpecificationExecutor
}
