public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        private void setName(String aName) {
                this.name = aName;
        }
        private void setStudentId(int aStudentID) {
                this.studentId = aStudentID;
        }
        public String getName() {
                return name;
        }
        private void setNumberOfCredits(int aNumberOfCredits) {
                this.numberOfCredits = aNumberOfCredits;
        }
        private void setGpa(double aGpa) {
                this.gpa = aGpa;
        }
        public int getStudentId() {
                return studentId;
        }



        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }


}
