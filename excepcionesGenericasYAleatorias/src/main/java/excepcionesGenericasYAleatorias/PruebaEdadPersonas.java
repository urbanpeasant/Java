package excepcionesGenericasYAleatorias;

public class PruebaEdadPersonas {
	public void generaExcepcionEdad (int edad) throws InfantilException, AdultoException, MayorException{
		if (edad < 18) {
			throw new InfantilException("La persona es menor de edad. Excepción de infantil");
		}else if (edad >=18 && edad <65) {
			throw new AdultoException("La persona es un adulto. Excepción de adulto.");
		}else if (edad > 65) {
			throw new MayorException ("La persona es mayor. Excepción de mayor.");
		}
	}
}

