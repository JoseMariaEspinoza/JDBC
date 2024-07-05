package com.corenetwork.modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoCategoria extends Conexion{

    public List<Categoria> obtenerTodas() throws ClassNotFoundException, Exception {
        //1. Declarar variables
        List<Categoria> resultado = new ArrayList<>();
        Statement st;
        ResultSet rs;
        String sql = "select category_id,category_name,description from categories;";
        //2. Abrir la conexion
        abrirConexion();
        //3. Recoger el statement de la conexion
        st = miConexion.createStatement();
        //4. Ejecutar el statement
        rs = st.executeQuery(sql);
        //5. Recorrer el ResultSet
        while (rs.next()) {
//			int id = rs.getInt(1);
//			String nombre = rs.getString(2);
//			String descripcion = rs.getString(3);
//			Categoria c1 = new Categoria(id, nombre, descripcion);
//			resultado.add(c1);
            resultado.add(new Categoria(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        //6. Cerrar todo
        rs.close();
        st.close();
        miConexion.close();
        //7. Devolver la coleccion
        return resultado;
    }
}
