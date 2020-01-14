
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chamoda
 */
public class MYCONNECTION {
    
    
    
    public Connection CreatConnection(){
    
    Connection connection =null;
    
    
    MysqlDataSource mds=new MysqlDataSource();
    
    mds.setServerName("localhost");
    mds.setPort(3306);
    mds.setUser("root");
    mds.setPassword("");
    mds.setDatabaseName("student_regis");
    
        try {
            connection= mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MYCONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
          return connection;
    
    
    }
    
    
}
