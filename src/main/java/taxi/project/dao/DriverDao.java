package taxi.project.dao;

import java.util.Optional;
import taxi.project.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
