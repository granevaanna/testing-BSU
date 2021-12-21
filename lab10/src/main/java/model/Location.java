package model;

import java.util.Objects;

public class Location {
    private String startAddress;
    private String endAddress;

    public Location(String startAddress, String endAddress) {
        this.startAddress = startAddress;
        this.endAddress = endAddress;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(startAddress, location.startAddress) && Objects.equals(endAddress, location.endAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startAddress, endAddress);
    }
}
