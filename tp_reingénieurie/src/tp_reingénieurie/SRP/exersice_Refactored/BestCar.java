package tp_reingénieurie.SRP.exersice_Refactored;


import java.util.List;


public class BestCar {
	public List<Car> _carsDb;

	public BestCar(List<Car> _carsDb) {
		this._carsDb = _carsDb;
	}
	
	public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
