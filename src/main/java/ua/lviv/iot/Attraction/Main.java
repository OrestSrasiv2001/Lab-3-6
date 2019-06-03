package main.java.ua.lviv.iot.Attraction;

import java.util.EnumSet;

import java.util.LinkedList;
import java.util.List;

import main.java.ua.lviv.iot.Attraction.Attraction;
import main.java.ua.lviv.iot.Attraction.Child;
import main.java.ua.lviv.iot.Attraction.Disneyland;
import main.java.ua.lviv.iot.Attraction.Karting;
import main.java.ua.lviv.iot.DisneylandDisneylandManager.*;

import java.util.ArrayList;

import main.java.ua.lviv.iot.Attraction.*;

public class Main {

	public static final void main(String[] args) {
		List<Attraction> list = new ArrayList<>();
		AttractionManagerImpl AttractionManager = new AttractionManagerImpl();

		Attraction Child = new Child(100, 3, DangerLevel.HIGH, 10, 65, 120);
		Attraction disneyland = new Disneyland(120, 20, DangerLevel.LOW, 2000, 51.3456d, 4.5);
		Attraction karting = new Karting(150.50, 20, DangerLevel.MAXIMUM, 10, "Mazda", "Carbon");
		Attraction rollerCoaster = new RollerCoaster(200, 50, DangerLevel.MIDDLE, 100, 15, "plastic");

		list.add(Child);
		list.add(disneyland);
		list.add(karting);
		list.add(rollerCoaster);

		AttractionManager.sortAttractionByPrice(list, false);
		System.out.println("");
		AttractionManager.sortAttractionByPrice(list, true);

		System.out.println(AttractionManager.findAttraction(DangerLevel.HIGH));

	}
}
