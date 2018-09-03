package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class Pacientes {
    String IdPaciente;
    String NomPaciente;
    String ApePaciente;
    String Estado;

    public String getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(String IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public String getNomPaciente() {
        return NomPaciente;
    }

    public void setNomPaciente(String NomPaciente) {
        this.NomPaciente = NomPaciente;
    }

    public String getApePaciente() {
        return ApePaciente;
    }

    public void setApePaciente(String ApePaciente) {
        this.ApePaciente = ApePaciente;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Pacientes(String IdPaciente, String NomPaciente, String ApePaciente, String Estado) {
        this.IdPaciente = IdPaciente;
        this.NomPaciente = NomPaciente;
        this.ApePaciente = ApePaciente;
        this.Estado = Estado;
    }
    
}
