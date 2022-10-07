package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.io.File;
public class CEHibernateUtil {
        private static final SessionFactory sessionFactory = buildSessionFactory();
        private static SessionFactory buildSessionFactory(){
            try {
                return new Configuration().configure(new File("src\\main\\resources\\hibernate.cfg.xml")).buildSessionFactory();
            }
            catch (Throwable ex){
                System.err.println("Init sessionFactory created failed"+ ex);
                throw new ExceptionInInitializerError();
            }
        }
        public static SessionFactory getSessionFactory(){
            if (sessionFactory == null){buildSessionFactory();}
            return sessionFactory;
        }
        public static void shutdown(){
            getSessionFactory().close();
        }
    }


