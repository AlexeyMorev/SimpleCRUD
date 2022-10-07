package UserDAo;

import Entity.Users;
import Util.CEHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class UserDAO {
    public List<Users> findAll(){
        return  CEHibernateUtil.getSessionFactory().openSession().createQuery("FROM Users", Users.class).list();
    }
    public Users findById(int id){
        return CEHibernateUtil.getSessionFactory().openSession().get(Users.class, id);
    }
    public void save(Users users){
        Session session = CEHibernateUtil.getSessionFactory().openSession();
        Transaction tr1 = session.beginTransaction();
        session.persist(users);
        tr1.commit();
        session.close();
    }
    public void delete(int id){
        Session session = CEHibernateUtil.getSessionFactory().openSession();
        Transaction tr1 = session.beginTransaction();
        Users users =  session.get(Users.class, id);
        session.remove(users);
        tr1.commit();
        session.close();
    }

    public void update(Users users){
        Session session = CEHibernateUtil.getSessionFactory().openSession();
        Transaction tr1 = session.beginTransaction();
            users.setName(users.getName());
            users.setProfession(users.getProfession());
            session.merge(users);
            tr1.commit();
            session.close();

        }
    }


