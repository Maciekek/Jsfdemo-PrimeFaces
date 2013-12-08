package com.example.jsfdemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Car;
import com.example.jsfdemo.service.CarManager;

@SessionScoped
@Named("carBean")
public class CarFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Car car = new Car();
	private ListDataModel<Car> cars = new ListDataModel<Car>();

	@Inject
	private CarManager cm;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public ListDataModel<Car> getAllCars() {
		cars.setWrappedData(cm.getAllCars());
		return cars;
	}

	// Actions
	public String addCar() {
		cm.addCar(car);
		return "showCars";
		// return null;
	}

	// public String deleteCar() {
	// Car carToDelete = cars.getRowData();
	// cm.deleteCar(carToDelete);
	// return null;
	// }

	// Validators

	// Multi field validation with <f:event>
	// Rule: first two digits of PIN must match last two digits of the year of
	// birth
	// public void validatePinDob(ComponentSystemEvent event) {
	//
	// UIForm form = (UIForm) event.getComponent();
	// UIInput pin = (UIInput) form.findComponent("pin");
	// UIInput dob = (UIInput) form.findComponent("dob");
	//
	// if (pin.getValue() != null && dob.getValue() != null
	// && pin.getValue().toString().length() >= 2) {
	// String twoDigitsOfPin = pin.getValue().toString().substring(0, 2);
	// Calendar cal = Calendar.getInstance();
	// cal.setTime(((Date) dob.getValue()));
	//
	// String lastDigitsOfDob = ((Integer) cal.get(Calendar.YEAR))
	// .toString().substring(2);
	//
	// if (!twoDigitsOfPin.equals(lastDigitsOfDob)) {
	// FacesContext context = FacesContext.getCurrentInstance();
	// context.addMessage(form.getClientId(), new FacesMessage(
	// "PIN doesn't match date of birth"));
	// context.renderResponse();
	// }
	// }
	// }
}
