package tp_reingénieurie.SRP.exersice_Refactored;

import java.util.List;

public class CarNames {
	public List<Car> _carsDb;

	public CarNames(List<Car> _carsDb) {
		this._carsDb = _carsDb;
	}
	
	public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
