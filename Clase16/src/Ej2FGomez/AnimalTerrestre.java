package Ej2FGomez;

public class AnimalTerrestre extends Animal {
	
	public static final Class<? extends Animal> AnimalTerrestre = null;
	private int canti_pata;
	private String tipo_alimento;
	private int horas_sueÒo;
	
	//Constructor
	public AnimalTerrestre() {}
	public AnimalTerrestre(String _tipo,String _Nombre,String _Pais, String _Fecha_ingreso, int _canti_patas, String _tipo_alimento, int _hora_sueÒo) {
		super(_tipo, _Nombre,_Pais,_Fecha_ingreso);
		this.canti_pata = _canti_patas;
		this.tipo_alimento = _tipo_alimento;
		this.horas_sueÒo = _hora_sueÒo;
	}
	//SETTERS GETTERS
	public int getCanti_pata() {
		return canti_pata;
	}
	public void setCanti_pata(int canti_pata) {
		this.canti_pata = canti_pata;
	}
	public String getTipo_alimento() {
		return tipo_alimento;
	}
	public void setTipo_alimento(String tipo_alimento) {
		this.tipo_alimento = tipo_alimento;
	}
	public int getHoras_sueÒo() {
		return horas_sueÒo;
	}
	public void setHoras_sueÒo(int horas_sueÒo) {
		this.horas_sueÒo = horas_sueÒo;
	}
	//ToString
	@Override
	public String toString() {// al ser llamado el toString , anteponemos el super.toString PARA ASI TRAER TODOS LOS DATOS.
		return "AnimalTerrestre "+super.toString()+", canti_pata = " + canti_pata + ", tipo_alimento = " + tipo_alimento + ", horas_sueÒo = "
				+ horas_sueÒo + "]";
	}
	
	
	
}