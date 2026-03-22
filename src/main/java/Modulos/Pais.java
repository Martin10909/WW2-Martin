/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulos;

/**
 *
 * @author marti
 */
public class Pais {
    
    private int id;
    private String nombre;
    private String continente;
    private int poblacion;
    private int poderMilitar;

    // Constructor vacío
    public Pais() {
    }

    // ✅ Constructor SIN id (para insertar en BD)
    public Pais(String nombre, String continente, int poblacion, int poderMilitar) {
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
        this.poderMilitar = poderMilitar;
    }

    // ✅ Constructor CON id (para cuando lees desde BD)
    public Pais(int id, String nombre, String continente, int poblacion, int poderMilitar) {
        this.id = id;
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
        this.poderMilitar = poderMilitar;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getPoderMilitar() {
        return poderMilitar;
    }

    public void setPoderMilitar(int poderMilitar) {
        this.poderMilitar = poderMilitar;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", poblacion=" + poblacion +
                ", poderMilitar=" + poderMilitar +
                '}';
    }
}
