package examples.school;

public class Estudiante extends Persona {

	private int numeroEstudiante;

	private double[] notas;

	public double calcularMedia() {

		double suma = 0;
		int elementos = 0;

		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
			elementos = elementos + 1;
		}

		if (elementos == 0) {
			return 0;
		}

		return suma / elementos;
	}

	public double calcularMatricula() {

		double precio = 0.0;

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < 5) {
				precio = precio + 200;
			} else {
				precio = precio + 100;
			}
		}

		return precio;
	}

	public int getNumeroEstudiante() {
		return numeroEstudiante;
	}

	public void setNumeroEstudiante(int numeroEstudiante) {
		this.numeroEstudiante = numeroEstudiante;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
