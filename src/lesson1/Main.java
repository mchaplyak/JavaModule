package lesson1;

import lesson1.User.Address;
import lesson1.User.User;

public class Main {
    public static void main(String[] args) {

        Address user1Address = new Address("Shevchenka", "suite 777", "Kyiv", 23564);

        User user1 = new User(1, "Vova", "vovova", "vovova@gmail.com", user1Address, "vovova.me", "+3(093)3332211");
        Post post1 = new Post(1, 1, "firstPost","This is my first post");
        Comment comment1 = new Comment(1, 1, "myFirstComment", "helloWorld@yahoo.com", "HelloWorld!");

        System.out.println(user1);
        System.out.println(post1);
        System.out.println(comment1);
    }
}
