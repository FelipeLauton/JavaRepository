package POO;

public class MetodoSobreCarga {
	public void testaMetodosSobreCarregados() {
		System.out.printf("Salário em número inteiro: %d\n",salario(1000));
		System.out.printf("Salário em número inteiro: %f\n",salario(7.500));
	}
	public int salario(int valorInt) {
		System.out.printf("Salário em número argumentointeiro: %d\n",valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble) {
		System.out.printf("Salário em número argumentointeiro: %f	\n",valorDouble);
		return valorDouble * valorDouble;
	}
}
