package taxi.project;

import taxi.project.dao.DriverDao;
import taxi.project.dao.impl.DriverDaoImpl;
import taxi.project.model.Driver;

public class Main {
    public static void main(String[] args) {
        DriverDao dao = new DriverDaoImpl();
        Driver driver = new Driver("igor","login","asd","154");
        dao.create(driver);
    }
}
