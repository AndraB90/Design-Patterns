package Builder;

public class User {
    private String name;
    private String eMail;
    private String password;
    private int age;

    public User(String name, String eMail, String password, int age) {
        this.name = name;
        this.eMail = eMail;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.println("Name: "+name);
        System.out.println("E-Mail: "+eMail);
        System.out.println("Password: "+password);
        System.out.println("Age: "+age);
    }

    public static class UserBuilder{
        private String name;
        private String eMail;
        private String password;
        private int age;

        public User build(){
            return new User(this.name, this.eMail, this.password, this.age);
            }

        public UserBuilder name(String name){
            this.name=name;
            return this;
        }

        public UserBuilder eMail(String eMail){
            this.eMail=eMail;
            return this;
        }

        public UserBuilder password(String password){
            this.password=password;
            return this;
        }

        public UserBuilder age(int age){
            this.age=age;
            return this;
        }

    }
}
