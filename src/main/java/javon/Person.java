package javon;

public class Person {


        String name;
        String lastname;
        String middlename;
        int numberofeyes;
        String clothes;


        public Person(String name, String lastname, String middlename, int numberofeyes, String clothes) {
            this.name = name;
            this.lastname = lastname;
            this.middlename = middlename;
            this.numberofeyes = numberofeyes;
            this.clothes = clothes;
        }

        public int getNumberofeyes() {
            return numberofeyes;

        }

        public void setClothes(String clothes) {
            this.clothes = clothes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

    }

