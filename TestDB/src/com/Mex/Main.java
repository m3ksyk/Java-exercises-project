package com.Mex;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\apki\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try {
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\apki\\TestDB\\testjava.db");

            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                      "(" + COLUMN_NAME + " text, " +
                                            COLUMN_PHONE + " integer, " +
                                            COLUMN_EMAIL + " text" +
                                        ")"
            );

            insertContact(statement, "Bob",123456, "bob@bob.com" );
            insertContact(statement, "Joe", 654321, "joe@bob.com" );
            insertContact(statement, "Moe", 654323, "Moe@bob.com" );
            insertContact(statement, "Joanne", 654322, "joanne@bob.com" );



//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    "(" + COLUMN_NAME + ", " +
//                          COLUMN_PHONE + ", " +
//                          COLUMN_EMAIL  +
//                    ")" +
//                    "VALUES('Joe', 654321, 'joe@bob.com')"
//            );
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    "(" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL  +
//                    ")" +
//                    "VALUES('Moe', 654323, 'Moe@bob.com')"
//            );
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    "(" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL  +
//                    ")" +
//                    "VALUES('Joanne', 654322, 'joanne@bob.com')"
//            );
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    "(" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL  +
//                    ")" +
//                    "VALUES('Bob', 123456, 'bob@bob.com')"
//            );
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=555444" + " WHERE " +
                    COLUMN_NAME + "='Joanne'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " +
                    COLUMN_NAME + "='Moe'");

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }


//           conn.setAutoCommit(false);
//            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE  IF NOT EXISTS contacts " +
//                    "(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts(name, phone, email) VALUES ('Joe', 654321, 'joe@bob.com')");
//            statement.execute("INSERT INTO contacts(name, phone, email) VALUES ('Moe', 654323, 'Moe@bob.com')");
//            statement.execute("INSERT INTO contacts(name, phone, email) VALUES ('Joanne', 654322, 'joanne@bob.com')");
//            statement.execute("UPDATE contacts SET phone=555444 WHERE name='Joanne' ");
//            statement.execute("DELETE FROM contacts WHERE name='Moe'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
//            while (results.next()) {
//                System.out.println(results.getString("name") + " " +
//                        results.getInt("phone") + " " +
//                        results.getString("email"));
//            }

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                "(" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL  +
                ")" +
                "VALUES('" + name + "', " + phone + ", '" + email + "')"
        );
    }
}
