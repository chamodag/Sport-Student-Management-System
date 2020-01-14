
import java.sql.PreparedStatement;
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
public class PASSWORD {
    
    
    MYCONNECTION my_connection=new MYCONNECTION();
    public boolean addpassword(String password,String user_name){
    
    PreparedStatement st;
    
    String addQuery ="INSERT INTO `password`(`user_name`, `password`) VALUES (?,?)";
    
    
     try {
            st=my_connection.CreatConnection().prepareStatement(addQuery);
            
            
                st.setString(1, user_name);
                 st.setString(2, password);
                 
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
