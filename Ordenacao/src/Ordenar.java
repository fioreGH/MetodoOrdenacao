
public class Ordenar {

	public static void main(String[] args) {


		int[] v = {63,19,99,7,22,85,71,4};

		int tempA, tempB, tempC, tamanhoVetor;

		tamanhoVetor = v.length - 1;

		for (int i = 0; i < tamanhoVetor; i++) {

			do {

				for (int j = 0; j < tamanhoVetor; j++) {

					tempA = v[j];
					tempB = v[j+1];

					while (tempA > tempB ) {

						tempC = tempA;
						tempA = tempB;
						tempB = tempC;
					}

					v[j] = tempA;
					v[j+1] = tempB;

				}

			} while (v[i]> v[i+1]);

		}

		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
}
