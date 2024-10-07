package homework_15;

class Teacher {
        String name;
        int age;

        public Teacher(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void teach() {
            System.out.println(name + " is teaching ");
        }


    }