public class ConversaoDeTemperatura {
    static public float celsiusToFarenheit(float c) {
        return (float) ((c*1.8)+32);
    }
    static public float farenheitToCelsius(float f) {
        return (float) ((f-32)/1.8);
    }
}
