package Student;



    public class Student {

        // TODO: khai báo các thuộc tính cho Student
        private String ID;
        private String name;
        private String group;
        private String email;



        // TODO: khai báo các phương thức getter, setter cho Student


        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        /**
         * Constructor 1
         */
        public  Student() {
            // TODO:
           name = "Student" ;
            ID = "000" ;
            group = "INT22041" ;
            email = "uet@vnu.edu.vn" ;
        }

        /**
         * Constructor 2
         *
         * @param n
         * @param sid
         * @param em
         */
        public Student(String n, String sid, String em) {
            // TODO:
            name = n ;
            sid = ID ;
            em = email ;
            group = "INT22041" ;
        }

        /**
         * Constructor 3
         *
         * @param s
         */
        public Student(Student s) {
            // TODO:
            name = s.name;
            ID = s.ID;
            group = s.group;
            email = s.email;
        }



        public String getInfo() {
            // TODO:
            // return null; // xóa dòng này sau khi cài đặt
            return "Student{" +
                    "ID='" + ID + '\'' +
                    ", name='" + name + '\'' +
                    ", group='" + group + '\'' +
                    ", email='" + email + '\'' +
                    '}';

        }
    }


