public class Exemplu2
{
    public static void main(String [] args){
        DBConnection con = null;
        try {
            con= new DBConnection(); //folosim resurse
        } catch(Exception e){
            
        } finally{
            if(con !=null){
                //con.close();
            }
    }
}}
