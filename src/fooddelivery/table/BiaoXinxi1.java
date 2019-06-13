/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery.table;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class BiaoXinxi1 extends AbstractTableModel  {
       Connection con=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       Vector<Serializable> rowData,columnName;
       public BiaoXinxi1(String sql){
          init( sql) ;
       }

       public BiaoXinxi1(){

        }
       public void init(String sql){

                //columnName保存表头信息
               columnName=new Vector<Serializable>();
               columnName.add("Name");
               columnName.add("Phone");
               columnName.add("Address");
               columnName.add("Preasure_time");
               


            //rowData向量保存每一行的信息
            rowData=new Vector<Serializable>();
           try {
            con = DBConnection.getConnection();
             ps=(PreparedStatement) con.prepareStatement( sql);
             rs=ps.executeQuery();
            while(rs.next()){
                   Vector bang=new Vector();
                   bang.add(rs.getString(1) );
                   bang.add(rs.getString(2) );
                   bang.add(rs.getString(3) );
                   bang.add(rs.getString(4) );
                   

                   //将读取的每一行数据添加到bang中，然后再把bang添加到rowData向量中
                    rowData.add(bang);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(con!=null&&ps!=null&rs!=null){
                try {
                    con.close();
                    ps.close();
                    rs.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }

            }
        }
  }
    public void SQL(String sql){
         Connection con=null;
         PreparedStatement ps=null;
        int rs;

        try {
            con = DBConnection.getConnection();
             ps=(PreparedStatement) con.prepareStatement( sql);
             rs=ps.executeUpdate();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void delete(String sql){
        SQL( sql);

    }
    public void Add(String sql){
        SQL( sql);

    }

    public void Update(String sql){
        SQL( sql);

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @Override
   public int getRowCount() {
        return this.rowData.size();
   }

   @Override
   public int getColumnCount() {
      return this.columnName.size();
   }

   @Override
   public Object getValueAt(int  row, int column) {
        return  ((Vector ) this.rowData.get(row)).get(column);
   }
   public String getColumnName(int column) {

        return   (String) this.columnName.get(column);
    }


  }



