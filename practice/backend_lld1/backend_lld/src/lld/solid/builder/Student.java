package lld.solid.builder;

public class Student {

    private final String name;
    private final Integer age;
    private final String phoneNumber;
    private final Integer gradYear;

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    static class Builder{
        private String name;
        private Integer age;
        private String phoneNumber;
        private Integer gradYear;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder age(Integer age)
        {
            this.age = age;
            return this;
        }

        public Builder phoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder gradYear(Integer gradYear)
        {
            this.gradYear = gradYear;
            return this;
        }

        public void validate()
        {
            if(age != null && age < 18)
                throw new IllegalArgumentException("User is under age");

            if(gradYear != null && gradYear >=2026)
                throw new IllegalArgumentException("User has not yet graduated");
        }

        public Student build()
        {
            validate();
            return new Student(this);
        }
    }
}
