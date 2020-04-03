public class MobilePhoneTester {
    public static class MobilePhone {
        private String brand;
        // private String model;
        private double batteryCapacity;
        private double batteryAmount;
        //   private double memory;
        private double freeMemory;

        MobilePhone(String b, double bc, double m) {
            brand = b;
            batteryCapacity = bc;
            freeMemory = m;
        }

        void installApplication(String appName, double appMemory) {
            if (this.freeMemory < appMemory) {
                System.out.println("Application " + appName + " can't be installed on " + this.brand + ". No enough memory.");
            } else {
                this.freeMemory -= appMemory;
                System.out.print("Application " + appName + " has been installed on " + this.brand + ".");
                System.out.println(" Remaining memory: " + this.freeMemory);
            }
        }

        void charge() {
            this.batteryAmount = this.batteryCapacity;
            System.out.println(this.brand + " has been charged. Remaining battery amount: " + this.batteryAmount);
        }

        void use(String app, double hours) {
            if (this.batteryAmount == 0) {
                System.out.print("Application " + app + " cannot be run on " + this.brand + ".");
                System.out.println(" The phone is discharged.");
            } else if (this.batteryAmount <= 100 * hours) {
                double maxHours = this.batteryAmount / 100;
                hours = maxHours;
                System.out.print("Application " + app + " has been run for " + hours + " on " + this.brand + ".");
                this.batteryAmount -= hours * 100;
                System.out.println(" The phone has been discharged.");
            } else {
                System.out.print("Application " + app + " has been run for " + hours + " on " + this.brand + ".");
                this.batteryAmount -= hours * 100;
                System.out.println(" Remaining battery amount: " + this.batteryAmount);
            }

        }

        public static void main(String[] args) {
            MobilePhone samsung = new MobilePhone("Samsung galaxy", 1000, 500);
            samsung.charge();
            samsung.installApplication("Google maps", 100);
            samsung.installApplication("Tinder", 200);
            samsung.installApplication("Pokemon GO", 250);
            samsung.use("YouTube", 5);
            samsung.use("Facebook", 6);
            samsung.use("Angry Birds", 2);
            samsung.charge();
            samsung.use("Angry Birds", 2);

        }
    }
}