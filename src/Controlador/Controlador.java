/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consultas;

/**
 *
 * @author KSGAMER
 */
public class Controlador {

    public Controlador() {
    }

    Consultas con = new Consultas();

    public void AgregarUser(String nombre, String Apellido, String Usuario, String Contrase, String Fecha, String Estado) {
        String Perfil = "";
        switch (Estado) {
            case "Administrador":
                Perfil = "A";
                break;
            case "Normal":
                Perfil = "N";
                break;
            default:
                Perfil = "E";
                break;

        }
        con.AgregarUsuario(nombre, Apellido, Usuario, Contrase, Fecha, Perfil);
    }
}
