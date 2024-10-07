package homework_15;

class Doctor {
         String name;
         int age;

        public Doctor(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void diagnose() {
            System.out.println(name + " is diagnosing a patient.");
        }

    }