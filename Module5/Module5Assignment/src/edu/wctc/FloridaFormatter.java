package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        return driversLicense.getSSSS() + "-" + driversLicense.getFFF() + "-" + driversLicense.getYY() + "-" + driversLicense.getDDD() + "-" + driversLicense.getNN();
    }
}
