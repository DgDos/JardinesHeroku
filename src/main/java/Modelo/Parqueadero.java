/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Labing
 */
public class Parqueadero {
 
    private int idparqueadero;
    private String parqueadero;
    private String status;

    public Parqueadero() {
    }

    public int getIdparqueadero() {
        return idparqueadero;
    }

    public void setIdparqueadero(int idparqueadero) {
        this.idparqueadero = idparqueadero;
    }

    public String getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(String parqueadero) {
        this.parqueadero = parqueadero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIdParqueadero(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
            
}
