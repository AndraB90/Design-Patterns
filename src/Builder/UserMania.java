package Builder;

public class UserMania {
    public static void main(String[] args) {
        User user1=new User.UserBuilder()
                .name("Maria")
                .eMail("maria.botean@gmx.ch")
                .password("**********")
                .age(56)
                .build();

        user1.print();
        System.out.println("===========================");

        User user2=new User.UserBuilder()
                .name("Andra")
                .eMail("andra.botean@gmail.com")
                .password("*****************")
                .age(32)
                .build();

        user2.print();
        System.out.println("===========================");

        User user3=new User.UserBuilder()
                .name("Gheorghe")
                .eMail("bgigi@web.de")
                .password("*****")
                .age(60)
                .build();

        user3.print();

    }
}
