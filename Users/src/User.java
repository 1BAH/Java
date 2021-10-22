public class User {
    private String firstName;
    private String secondName;
    private Integer age;

    public User (String firstName, String secondName, Integer age) {
        this.setAge(age);
        this.setFirstName(firstName);
        this.setSecondName(secondName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
