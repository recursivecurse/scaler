package collections.queue;

public class Student /*implements Comparable<Student> */{

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // public int compareTo(Student other) {
    //     if(this.age == null && other.age == null) {
    //         return 0;
    //     } else if(this.age == null) {
    //         return -1;
    //     } else if(other.age == null) {
    //         return 1;
    //     }

    //     if(this.age.equals(other.age)) {
    //         return this.name.compareToIgnoreCase(other.name);
    //     }

    //     return other.age - this.age;
    // }

}
