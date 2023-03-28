package encapsulationAct;
public class Automobile {
        private String wheels, material, color, fuel, speed;

        public Automobile(String wheels, String material, String color, String fuel, String speed) {
            this.material = material;
            this.color = color;
            this.fuel = fuel;
            this.speed = speed;
        }

        public void accelerate(String newSpeed) {
            this.speed = newSpeed;
        }

        public void decelerate(String newSpeed) {
            this.speed = newSpeed;
        }

        public void stop() {
            this.speed = "STOP";
        }

    }
