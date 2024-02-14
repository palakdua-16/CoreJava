package src.oopsadv.Map;



import java.util.*;

public class AutomationEXmaster {
    public static void main(String[] args) {
        //5 students
        Student su1 = new Student(1, "palak", "123@g.com", "9090876777");
        Student su2 = new Student(1, "palak", "123@g.com", "9090876777");
        Student su3 = new Student(1, "palak", "123@g.com", "9090876777");
        Student su4 = new Student(1, "palak", "123@g.com", "9090876777");
        Student su5 = new Student(1, "palak", "123@g.com", "9090876777");

        //added to list 1
        List<Student> s = new ArrayList<>();
        s.add(su1);
        s.add(su2);
        s.add(su3);
        //added to list 2
        List<Student> s1 = new ArrayList<>();
        s1.add(su4);
        s1.add(su5);

        //added to batch 1 containing 2 list so we learnt concept of List in Map
        Map<String, List<Student>> batch1 = new TreeMap<String, List<Student>>();
        batch1.put("ATB1", s);
        batch1.put("ATB2", s1);
        //added to batch 2containing 2 list so we learnt concept of List in Map
        Map<String, List<Student>> batch2 = new TreeMap<String, List<Student>>();
        batch2.put("MTB1", s);
        batch2.put("MTB2", s1);
        //Parent of above 2
        Map<String, Map<String, List<Student>>> courses = new TreeMap<>();
        courses.put("Automation", batch1);
        courses.put("Manual", batch2);
        //iterate them we have to find how many courses it have
        Set<String> courseNames = courses.keySet();
        System.out.println(courseNames); //it will only have key values Automatation,Manual

        char ch = 'A';
        for (String cname : courseNames) {
            System.out.println(ch++ + ") Course: " + cname);
            Map<String, List<Student>> batchMap = courses.get(cname);
            Set<String> batchIds = batchMap.keySet();
            for (String batchId : batchIds) {
                List<Student> stuList = batchMap.get(batchId);
                System.out.println();
                System.out.println("Students of " + batchId + "Total : " + stuList.size())
                System.out.println("-----------------------------------------");
                int count = 1;
                for (Student mystu : stuList) {
                    System.out.println(count + "." + mystu);


                }
            }
        }


        class Student {
            private Integer sid;
            private String name;
            private String email;
            private String phone;

            Student() {
                System.out.println("dc");
            }

            public Student(Integer sid, String name, String email, String phone) {

                this.sid = sid;
                this.name = name;
                this.email = email;
                this.phone = phone;
            }

            @Override
            public String toString() {

                return "Student{" +
                        "sid=" + sid +
                        ", name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
            }


        }
    }
}
