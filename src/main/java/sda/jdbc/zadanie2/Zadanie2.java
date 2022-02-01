package sda.jdbc.zadanie2;

/*napisz kod umożliwający dodawanie nowych kategorii to bazy danych*/

import sda.jdbc.util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Zadanie2 {

    private static final int CATEGORY_NAME_INDEX = 1;

    public static void main(String[] args) throws SQLException {

        String upDate = "Insert into category (CAT_NAME) values (?) ";

        DatabaseConnection databaseConnection = new DatabaseConnection();

        PreparedStatement preparedStatement = databaseConnection
                .getConnection()
                .prepareStatement(upDate);

        preparedStatement.setString(CATEGORY_NAME_INDEX, "Cars");

        int count = preparedStatement.executeUpdate();
        System.out.println("dodano " + count + " wierszy");
        databaseConnection.getConnection().close();
    }
}
