package learningMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class myClass {

    public void main()
    {
         try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testing","postgres", "");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from probando.tabla");
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("columna"));
            }

        }
        catch(Exception ex)
        {
            System.out.println("Something went wrong, maybe pwd not set");
            System.out.println(ex.getMessage());
        }
        //App.main(null);
        //System.out.println("hola vscoder gilipollas!");
    }
}