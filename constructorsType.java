class Student {
    String name;
    int age;
    int[] marks;

    // Proper Constructor
    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        // this.marks = marks;

        // Deep Copy of marks array
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }
    //shallow copy constructor
    // Student(Student s){
    //     this.name = s.name;
    //     this.age = s.age;
    //     this.marks = s.marks;

    // }
    // Deep Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;

        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}

public class constructorsType {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70};

        Student s1 = new Student("Onkar", 21, arr);
        Student s2 = new Student(s1);

        s2.marks[0] = 100;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(s1.marks[0]);  // Output: 90 ✔
    }
}
