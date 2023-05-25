package com.codeup.adlister;


import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordsDemo {


    public static void main(String[] args) {
        // Find a user by username using the MySQLUsersDao.findByUsername() method
        User user = DaoFactory.getUsersDao().findByUsername("cole123");
        // Store the users' password in a variable
        String plainTextPassword = user.getPassword();

        // Hash the password using the BCrypt.hashpw() method
        String hashPw = BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
        // Print the newly hashed password
//        System.out.println("Hashed Password: " + hashPw);

        // set the user's password using the BCrypt.hashpw() method'
        user.setPassword(hashPw);
        // Print the user's newly hashed password
//        System.out.println(user.getPassword());


//        DaoFactory.getUsersDao().insert(user);

        // -----------------------------------------------------------------------

        // How to check against a hashed password

        // Find a user by username from out database
        User userAttemptingToLogin = DaoFactory.getUsersDao().findByUsername("cole123");

        System.out.println(user.getPassword());
        System.out.println(userAttemptingToLogin.getPassword());

        // set a boolean variable to check if the passwords match
        boolean passwordsMatch = BCrypt.checkpw(userAttemptingToLogin.getPassword(), user.getPassword());


        System.out.println(passwordsMatch);
        System.out.println(user.getPassword().equals(userAttemptingToLogin.getPassword()));



    }
}
