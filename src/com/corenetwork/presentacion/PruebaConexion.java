package com.corenetwork.presentacion;

import com.corenetwork.modelo.AccesoCategoria;
import com.corenetwork.modelo.Conexion;

import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        AccesoCategoria ac = new AccesoCategoria();
        try {
            System.out.println(ac.obtenerTodas());
        } catch (Exception e) {
            System.out.println(e.toString());;
        }
    }
}
