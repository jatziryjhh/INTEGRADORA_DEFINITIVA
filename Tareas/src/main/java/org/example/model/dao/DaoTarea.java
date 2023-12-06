package org.example.model.dao;

import org.example.model.bean.BeanTarea;
import org.example.utils.MysqlConector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoTarea implements DaoRepository{
    private Connection con;
    private PreparedStatement pstm;
    private ResultSet rs;


    @Override
    public List findAll() {
        List<BeanTarea> listaBeanTarea = new ArrayList<>();
        try {
            String query="SELECT * FROM TAREA";
            con=MysqlConector.connect();
            pstm=con.prepareStatement(query);
            rs=pstm.executeQuery();

            while (rs.next()){
                BeanTarea beanTarea = new BeanTarea();
                beanTarea.setId(rs.getInt(1));
                beanTarea.setNombre(rs.getString(2));
                beanTarea.setDescripcion(rs.getString(3));
                beanTarea.setFecha(rs.getString(4));
                beanTarea.setEstado(rs.getInt(5));
                listaBeanTarea.add(beanTarea);

                listaBeanTarea.add(beanTarea);
            }
        }catch (SQLException e){
            System.err.println("ERROR EN EL METODO FINDALL DAO TAREA"+e.getMessage());
        }finally {
            cerrarConexxiones("findAll");
        }
        return listaBeanTarea;
    }

    @Override
    public Object findOne(int id) {
        BeanTarea beanTarea = new BeanTarea();
        try {
            String query="SELECT * FROM TAREA WHERE ID = ?";
            con=MysqlConector.connect();
            pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            rs=pstm.executeQuery();
            if (rs.next()){
                beanTarea.setId(rs.getInt(1));
                beanTarea.setNombre(rs.getString(2));
                beanTarea.setDescripcion(rs.getString(3));
                beanTarea.setFecha(rs.getString(4));
                beanTarea.setEstado(rs.getInt(5));
            }
        }catch (SQLException e){
            System.err.println("ERROR EN EL METODO FINDONE DAO TAREA"+e.getMessage());
        }finally {
            cerrarConexxiones("findOne");
        }
        return beanTarea;
    }

    @Override
    public boolean update(int id, Object object) {
        boolean modificado=false;
        BeanTarea beanTarea = (BeanTarea) object;
        try {
            String query="UPDATE TAREA SET NOMBRE = ?, Descripcion = ?, Fecha = ?, Estado = ? WHERE ID = ?";
            con=MysqlConector.connect();
            System.out.println(query);
            pstm=con.prepareStatement(query);

            pstm.setString(1,beanTarea.getNombre());
            pstm.setString(2,beanTarea.getDescripcion());
            pstm.setString(3,beanTarea.getFecha());
            pstm.setInt(4,beanTarea.getEstado());
            pstm.setInt(5,beanTarea.getId());
            modificado=pstm.executeUpdate()>0;
        }catch (SQLException e){
            System.err.println("ERROR EN EL METODO UPDATE DAO TAREA"+e.getMessage());
        }finally {
            cerrarConexxiones("update");
        }
        return modificado;
    }

    @Override
    public boolean delete(int id) {
        boolean eliminado=false;
        try {
            String query="DELETE FROM TAREA WHERE ID = ?";
            con=MysqlConector.connect();
            pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            eliminado=pstm.executeUpdate()>0;
        }catch (SQLException e){
            System.err.println("ERROR EN EL METODO DELETE DAO TAREA"+e.getMessage());
        }finally {
            cerrarConexxiones("delete");
        }
        return eliminado;
    }

    @Override
    public boolean insert(Object object) {
        BeanTarea beanTarea = (BeanTarea) object;
        boolean agregado=false;
        int id = 0;
        try {
            String query="INSERT INTO TAREA(Nombre, Descripcion, Fecha, Estado) VALUES(?,?,?,?)";
            con=MysqlConector.connect();
            pstm=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1,beanTarea.getNombre());
            pstm.setString(2,beanTarea.getDescripcion());
            pstm.setString(3,beanTarea.getFecha());
            pstm.setInt(4,beanTarea.getEstado());
            agregado=pstm.executeUpdate()>0;

            if (agregado){
                rs=pstm.getGeneratedKeys();
                System.out.println("getGeneratedKeys "+rs);

                if (rs.next()){
                    id=rs.getInt(1);
                }
            }
        }catch (SQLException e){
            System.err.println("ERROR EN EL METODO INSERT DAO TAREA"+e.getMessage());
        }finally {
            cerrarConexxiones("insert");
        }
        return agregado;
    }

    private void cerrarConexxiones(String metodo){
        try {
            if (rs!=null){
                rs.close();
            }
            if (pstm!=null){
                pstm.close();
            }
            if (con!=null){
                con.close();
            }
        }catch (SQLException e){
            System.err.println("ERROR EN EL METODO CERRAR CONEXIONES DAO TAREA"+e.getMessage());
        }
    }

}
