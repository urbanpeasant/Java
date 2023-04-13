package ejercicioInterfaces;
public class Mensaje implements Logable {

	public String mensaje;
	
	public String prioridad;
	
	
	public void mensaje(String mensaje, String prioridad) {
		this.mensaje = mensaje;
		this.prioridad = prioridad;
		
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	public String getPrioridad() {
		return prioridad;
	}
	
	
	public String leerMensaje() {
        return mensaje;
    }
    
    public void cambiarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void cambiarPrioridadAlta() {
        prioridad = "alta";
    }
    
    public void cambiarPrioridadBaja() {
        prioridad = "baja";
    }
    
    public void cambiarPrioridadMedia() {
        prioridad = "media";
    }
	
	
	@Override
	public String toString() {
		return "Mensaje = "+ " " + mensaje + " " + "Prioridad =" + " " + prioridad;
	}
	
	
	
}