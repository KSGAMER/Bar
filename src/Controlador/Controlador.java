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
        String Perfil = Perfil(Estado, 1);

        con.AgregarUsuario(nombre, Apellido, Usuario, Contrase, Fecha, Perfil);
    }

    public String Perfil(String Estado, int re) {
        String Perfil = "";
        if (re == 1) {
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
        } else {
            switch (Estado) {
                case "A":
                    Perfil = "Administrador";
                    break;
                case "N":
                    Perfil = "Normal";
                    break;
                default:
                    Perfil = "X";
                    break;

            }
        }
        return Perfil;
    }
}
