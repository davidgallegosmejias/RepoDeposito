package cuentas;

/**
 * Clase que representa una cuenta
 * @author David
 * @version 1.0
 * @since 05/01/2020 
 * 
 */

public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * Metodo que devuelve el nombre de la cuenta
	 * @return nombre_cuenta
	 */

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo que modifica el nombre de la cuenta
	 * @param nombre nombre_de_la_cuenta_nuevo
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve la cuenta
	 * @return cuenta
	 */

	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Metodo que modifica la cuenta
	 * @param cuenta cuenta_nueva
	 */

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Metodo que devuelve el saldo la cuenta
	 * @return saldo_cuenta
	 */

	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Metodo que modifica el saldo la cuenta
	 * @param nombre saldo_nuevo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Metodo que devuelve el tipo de interes
	 * @return tipo_interes
	 */

	public double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * Metodo que modifica el nombre de la cuenta
	 * @param nombre nombre_de_la_cuenta_nuevo
	 */

	public void setTipoInteres(double tipoInter√) {
		this.tipoInteres = tipoInter√;
	}
	
	/**
	 * Constructor por defecto
	 */
	public CCuenta()
	{
	}

	/**
	 * Contructor parametrizado
	 * @param nom nombre de la cuenta
	 * @param cue cuenta
	 * @param sal saldo de la cuenta
	 * @param tipo tipo de cuenta
	 */
	
	public CCuenta(String nom, String cue, double sal, double tipo)
	{
		nombre =nom;
		cuenta=cue;
		saldo=sal;
	}

	/**
	 * Devuelve el estado de la cuenta
	 * @return estado_cuenta
	 */
	
	public double estado()
	{
		return saldo;
	}

	
	/**
	 * Metodo que realiza la operacion de ingresar saldo en la cuenta
	 * @param cantidad cantidad a ingresar
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception
	{
		if (cantidad<0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Metodo que realiza la operacion de retirar saldo en la cuenta
	 * @param cantidad cantidad a retirar
	 * @throws Exception
	 */
	
	public void retirar(double cantidad) throws Exception
	{
		if (cantidad <= 0)
			throw new Exception ("No se puede retirar una cantidad negativa");
		if (estado()< cantidad)
			throw new Exception ("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
