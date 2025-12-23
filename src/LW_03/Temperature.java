package LW_03;

class Temperature {
    private double celsius;
    private double fahrenheit;

    public double toCelsius() {
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public double toFahrenheit() {
        fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;

    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
