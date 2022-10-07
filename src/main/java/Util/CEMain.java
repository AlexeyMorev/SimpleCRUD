package Util;
import Entity.Users;
import UserDAo.Services.UserServices;
import java.util.List;

public class CEMain {
    public static void main(String[] args) {
UserServices userServices = new UserServices();
List <Users> user = userServices.findAll();
        System.out.println(user);
        /*Users users = new Users("name", "profession");
        userServices.saveUser(users);
        userServices.deleteUser(8);
        Users users1 = userServices.findUser(1);
        users1.setName("");
        users1.setProfession("");
        userServices.updateUser(users1);
        System.out.println(users1);*/

    }
}
