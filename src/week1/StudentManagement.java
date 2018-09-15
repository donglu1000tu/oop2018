//package week1;

import Student.Student;

public class StudentManagement {
    public static Student[] student = new Student[100]; // Max 100 hoc sinh

    public static void main(String[] args) {
        student[0] = new Student() ;
        student[0].setName("Le Hai Dang");
        student[0].setID("17020681");
        student[0].setGroup("K62-CF");
        student[0].setEmail("bonmatdoimu@gmail.com");
        student[0].getInfo();
        student[1] = new Student() ;
        student[1].setName("Nguyen Xuan Hoang") ;
        student[1].setID("17020983");
        student[1].setGroup("INT22041");
        student[2] = new Student() ;
        student[2].setName("Dinh The Hiep") ;
        student[2].setID("17080963") ;
        student[2].setGroup("INT22042");
        student[3] = new Student() ;
        student[3].setGroup(null);
        student[4] = new Student();
        student[4].setName("Dao Anh Duc");
        student[4].setGroup("K62-CF");
        student[4].setID("17020876") ;
        student[4].setEmail("daoduc@email.com") ;
        student[5] = new Student() ;
        student[5].setName("Mai Thanh Dat") ;
        student[5].setGroup("INT22042") ;
        student[5].setID("17090807") ;
        student[5].setEmail("datuet@email.com") ;
        student[6] = new Student() ;
        student[6].setName("Nguyen Thanh Duc") ;
        student[6].setID("17080674") ;
        student[6].setGroup("INT22041") ;
        student[6].setEmail("ducbeok62@email.com") ;
        if(sameGroup(student[1],student[2])) System.out.println("Cùng lớp");
        else System.out.println("Khác lớp");
        System.out.println("-------------");
        studentsByGroup() ;
        removeStudent(student[2].getID());
    }
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        //return false; // xóa dòng này sau khi cài đặt
        if (s1.getGroup()==null||s2.getGroup()==null) return false ;
        else if (s1.getGroup().equals(s2.getGroup()))
            return true;
        return false;
    }

    static void studentsByGroup() {
        // TODO:

        for (int i = 0; i < 5; i++) {
            if(student[i].getGroup()==null) continue;
            else{
                System.out.println(student[i].getGroup());
                System.out.println("Name: " + student[i].getName() + " ID: " + student[i].getID() + " Email: " + student[i].getEmail());
            }
            for (int j = i+1; j < 5; j++) {
                if(student[j].getGroup()==null) continue;
                else if (sameGroup(student[i], student[j])) {
                    System.out.println("Name: " + student[j].getName() + " ID: " + student[j].getID()+ " Email: " + student[j].getEmail());
                    student[j].setGroup(null);
                }

            }
            System.out.println("---------------------------");
        }
    }

    static void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < 100; i++) {
            if (student[i].getID() == id) {
                student[i].setName(null);
                student[i].setGroup(null);
                student[i].setID(null);
                student[i].setEmail(null);
            }
        }
    }


}
