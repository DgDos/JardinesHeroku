/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Parqueadero;
import Modelo.Parqueadero;
import Modelo.Tarifa;
import Util.DbUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author FiJus
 */
public class ParqueaderoDAO {

    private Connection connection;

    public ParqueaderoDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }

    public ArrayList<Parqueadero> getallParqueaderos() throws SQLException {
        ArrayList<Parqueadero> parqueaderoes = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from parqueadero");
        while (rs.next()) {
            Parqueadero pro = new Parqueadero();
            pro.setParqueadero(rs.getString("parqueadero"));
            pro.setStatus(rs.getString("status"));      
            parqueaderoes.add(pro);
        }
        return parqueaderoes;
    }
    
    public void updateParqueadero(Parqueadero e) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update parqueadero set status=? where id=?");
        preparedStatement.setString(1, e.getStatus());
        preparedStatement.setInt(2, e.getIdparqueadero());
        preparedStatement.executeUpdate();
    }
    
    public Parqueadero getParqueaderoById(String idPro) throws SQLException, URISyntaxException {
        Parqueadero pro = new Parqueadero();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from parqueadero where parqueadero='" + idPro+"'");
        while (rs.next()) {
            pro.setIdParqueadero(rs.getInt("id"));
            pro.setParqueadero(rs.getString("parqueadero"));
            pro.setStatus(rs.getString("status"));        
        }
        return pro;
    }
    
    public Tarifa getTarifa() throws SQLException, URISyntaxException {
        Tarifa pro = new Tarifa();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from tarifa where id=1 ");
        while (rs.next()) {
            pro.setTarifa(rs.getInt("tarifa"));              
        }
        return pro;
    }
    
     public Tarifa getTotal() throws SQLException, URISyntaxException {
        Tarifa pro = new Tarifa();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from tarifa where id=1 ");
        while (rs.next()) {
            pro.setTotal(rs.getInt("total"));              
        }
        return pro;
    }
      public Tarifa getGanancia() throws SQLException, URISyntaxException {
        Tarifa pro = new Tarifa();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from tarifa where id=1 ");
        while (rs.next()) {
            pro.setTotal(rs.getInt("ganancia"));              
        }
        return pro;
    }
}
