
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
 * 
 */

public class REGISTOR {
    
    MYCONNECTION my_connection=new MYCONNECTION();
    public boolean addstudent(String first_name,String second_name,String registration_number,String year,String faculty,String user_name,String sport){
    
    PreparedStatement st;
    
    
    String addQuery = "INSERT INTO `studentform`(`first_name`, `second_name`, `registration_number`, `year`, `faculty`, `user_name`, `sport`) VALUES (?,?,?,?,?,?,?) ";
    
        try {
            st=my_connection.CreatConnection().prepareStatement(addQuery);
            
            st.setString(1, first_name);
             st.setString(2, second_name);
             st.setString(3, registration_number);
              st.setString(4, year);
               st.setString(5, faculty);
                st.setString(6, user_name);
                 st.setString(7, sport);
                 
        if(st.executeUpdate()>0){
        
        return true;
        }else{
            return false;
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(REGISTOR.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
  
    }
    
    
    
    
    
}
