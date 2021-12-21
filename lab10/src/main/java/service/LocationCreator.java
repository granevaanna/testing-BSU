package service;

import model.Location;

public class LocationCreator {
    public static final String TESTDATA_START_ADDRESS = "testdata.location.startAddress";
    public static final String TESTDATA_END_ADDRESS = "testdata.location.endAddress";

    public static Location withLocationFromProperty() {
        return new Location(TestDataReader.getTestData(TESTDATA_START_ADDRESS),
                TestDataReader.getTestData(TESTDATA_END_ADDRESS));
    }

    public static Location withEmptyStartAddress() {
        return new Location("", TestDataReader.getTestData(TESTDATA_END_ADDRESS));
    }

    public static Location withEmptyEndAddress() {
        return new Location(TestDataReader.getTestData(TESTDATA_START_ADDRESS), "");
    }
}
