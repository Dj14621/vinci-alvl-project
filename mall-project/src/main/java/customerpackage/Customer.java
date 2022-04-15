package customerpackage;

public class Customer {
        //Fields
        //Encapsulation
        private String firstName;
        private String lastName;
        private String password;

        //Default Constructor
        public Customer() {
        }

        public Customer(String firstName) {
            this.firstName = firstName;
        }

        //Parameterized Constructor
        public Customer(String firstName, String lastName, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
        }

        //Getters and Setters
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
//        return "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", password=" + password +
//                '}';
            return getFirstName();
        }
}
