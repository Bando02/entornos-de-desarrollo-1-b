package Modelo.Model;


import java.util.*;

/**
 * Representa una casa del mundo real.
 */
public class Casa {
	
	private String direccion;
    private int numHabitaciones;
    private int metrosCuadrados;
    
    /**
    /**
     * Constructor por defecto
     */
    public Casa() {
    }

    /**
     * Constructor que recibe como parametros la dirrecion, el numero de habitaciones y los metros cuadrados
     * de la casa del mundo real.
     * 
     * @param dirección				La direccion de la cass
     * @param numHabitaciones 		El numero de habitaciones
     * @param metrosCuadrados		El numero de metros cuadrados de la casa
     */
     
     public Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
    	 
    	 this.direccion = direccion;
    	 this.numHabitaciones = numHabitaciones;
    	 this.metrosCuadrados = metrosCuadrados;
    	 
    }
    

    /**
     * 
     */
   
     
     
    

    
 

    /**
     * @return La direccion de la casa
     */
    public String getDireccion() {
        // TODO implement here
        return this.direccion;
    }

    /**
     * @return Los metros cuadrados de la casa
     */
    public int getmetrosCuadrados() {
        // TODO implement here
        return 0;
    }

    /**
     * @return El numero de habitaciones de la casa 
     */
    public int getnumHabitaciones() {
        // TODO implement here
        return 0;
    }

    /**
     * @param direccion		La direccon de la casa
     */
    public void setDireccion(String direccion) {
        // TODO implement here
    }

    /**
     * @param numHabitaciones		Numero de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        // TODO implement here
    }

    /**
     * @param metrosCuadrados 		Metros cuadrados de la casa
     */
    public void setMetrosCuadrados(int metrosCuadrados) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}