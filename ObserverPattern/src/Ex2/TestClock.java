package Ex2;

public class TestClock {

        public static void main(String[] args) {
            MyTimer clockTimer = new MyTimer();

            new AnalogClock(clockTimer);
            new DigitalClock(clockTimer);

        }
}
