package Controller;

public class qtdeInteiro {

    public qtdeInteiro() {
        super();

    }

    public int funcqtdeInteiro (int n ) {

        // Checando se o valor chegou no mínimo de dígitos possível
        if (n / 10 <= 0) {

            return 1;
        }


        // Somando mais 1 (dígito) e diminuindo uma casa do valor;
        return 1 + funcqtdeInteiro(n /10);

    }


}
