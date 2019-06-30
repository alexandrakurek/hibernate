package com.sda.db;


import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CatMenager {

//    private static final String INSERT_INTO_CATS_NAME_BIRTH_YEAR_COLOUR_VALUES = "INSERT INTO cats(name, birth_year, colour) VALUES (?, ?, ? )";
//
//    public void createCat(Connection connection) throws SQLException {
////        Statement statement = connection.createStatement();
////        statement.executeUpdate("INSERT INTO cats(name, birth_year, colour) VALUES ('Rys', 2000, 'Brown' )");
////        statement.executeUpdate("INSERT INTO cats(name, birth_year, colour) VALUES ('Kotlin', 2015, 'Black' )");
//
//        PreparedStatement statement = connection.prepareStatement(INSERT_INTO_CATS_NAME_BIRTH_YEAR_COLOUR_VALUES);
//        {
//            statement.setString(1, "Rys");
//            statement.setInt(2, 2000);
//            statement.setString(3, "Brown");
//            statement.executeUpdate();
//
//            statement.setString(1, "Rysiek");
//            statement.setInt(2, 2004);
//            statement.setString(3, "Black");
//            statement.executeUpdate();
//        }
//
//    }
//
//    List<Cat> findAllCats(Connection connection) throws SQLException {
//        Statement statemaent = connection.createStatement();
//        ResultSet result = statemaent.executeQuery("SELECT c.id as cat_id,c.name as cat_name,c.birth_year as cat_birth_year, c.colour as cat_colour FROM cats c");
//
//        List<Cat> cats = new ArrayList<>();
//        while (result.next()) {
//            int catId = result.getInt("cat_id");
//            String catName = result.getString("cat_name");
//            int catBirthYear = result.getInt("cat_birth_year");
//            String colour = result.getString("cat_colour");
//            cats.add(new Cat(catId,catName,catBirthYear,colour));
//        }
//        return cats;
//
//    }

    public void createCat (Session session, Cat cat){

        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(cat);
        transaction.commit();
        session.close();

    }
}
