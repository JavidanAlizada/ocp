package nested_classes;

import java.util.ArrayList;
import java.util.Random;

public class MemberInnerClass {
    public static void main(String[] args) {
        User user = new User("javidan205");
        user.showUserDetail();
    }
}


enum SaltWords {
    HELLO, HI, ABC, BYE, GOOD, BAD
}

class User {
    public User(String password) {
        this.password = password;
    }

    private String password;

    private interface Printer {
        void print();
    }

    public abstract class UserPasswordEncoder {
        String encrypt(String salt) {
            return salt + "#" + password;
        }
    }

    protected class UserInfo extends UserPasswordEncoder implements Printer {
        @Override
        public void print() {
            String[] salts = new String[SaltWords.values().length];
            for (SaltWords saltWords : SaltWords.values()) {
                salts[saltWords.ordinal()] = saltWords.toString();
            }
            System.out.println(encrypt(salts[new Random().nextInt(salts.length)]));
        }
    }

    public void showUserDetail() {
        UserInfo userInfo = new UserInfo();
        userInfo.print();
    }
}