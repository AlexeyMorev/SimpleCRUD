package UserDAo.Services;

import Entity.Users;
import UserDAo.UserDAO;

import java.util.List;

public class UserServices {
    private UserDAO userDAO = new UserDAO();
    public UserServices(){}
    public List<Users> findAll(){return userDAO.findAll();}

    public Users findUser(int id){return userDAO.findById(id);}

    public void saveUser(Users users){
        userDAO.save(users);
    }

    public void deleteUser(int id){userDAO.delete(id);}

    public void updateUser(Users users){ userDAO.update(users);}
}
