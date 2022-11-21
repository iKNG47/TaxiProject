package taxi.project.dao;

import java.util.List;
import taxi.project.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
