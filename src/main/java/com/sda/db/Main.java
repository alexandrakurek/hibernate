package com.sda.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {
        // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cats?createDatabaseIfNotExist=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "newpass");

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Cat c = new Cat("Rys", 2000, "Brown");
        Cat c2 = new Cat("Kotlin", 1999, "Black");
        Cat c3 = new Cat("Kondziu",1993,"white");

        CatMenager catMenager = new CatMenager();
        catMenager.createCat(sessionFactory.openSession(), c);
        catMenager.createCat(sessionFactory.openSession(), c2);
        catMenager.createCat(sessionFactory.openSession(), c3);



    }
}

    //            DBManager dbMenager = new DBManager();
//            dbMenager.createDb(connection);
//            dbMenager.clearTable(connection);

//    List<Cat> cats = catMenager.findAllCats(connection);
//            System.out.println(cats);

// Session session = sessionFactory.openSession();

// Transaction transaction = (Transaction) new DBManager();
//
//    }
