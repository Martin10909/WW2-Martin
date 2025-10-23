/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arms;

/**
 *
 * @author marti
 */
public class Air {
    private String name;
    private String origen;
    private String rol;
    private int ocupantes;
    private int alcance;

    public Air() {
    }

    public Air(String name, String origen, String rol, int ocupantes, int alcance) {
        this.name = name;
        this.origen = origen;
        this.rol = rol;
        this.ocupantes = ocupantes;
        this.alcance = alcance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    
    
    
}
