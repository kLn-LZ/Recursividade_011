package Controller;

public class qtdeInteiro {

    public qtdeInteiro() {
        super();

    }

    public int funcqtdeInteiro (int n ) {

        if (n / 10 <= 0) {

            return 1;
        }



        return 1 + funcqtdeInteiro(n /10);

    }


}
