import java.text.DecimalFormat;
import java.util.Scanner;

class Rupee {
    DecimalFormat f = new DecimalFormat("##.###");
    Scanner sc = new Scanner(System.in);

    public void convert() {
        System.out.println("Enter amount in rupees");
        double rupee = sc.nextFloat();

        //converting rupees
        double dollar = rupee / 66;
        System.out.println("Dollar : "+f.format(dollar));
        double pound = rupee / 98;
        System.out.println("Pound : "+f.format(pound));
        double euro = rupee / 72;
        System.out.println("Euro : "+f.format(euro));
        double yen = rupee / 0.55;
        System.out.println("Yen : "+f.format(yen));
        double taka = rupee * 1.15;
        System.out.println("Taka : "+f.format(taka));

        sc.close();
    }
}

class Dollar {
    DecimalFormat f = new DecimalFormat("##.###");
    Scanner sc = new Scanner(System.in);

    public void convert() {
        System.out.println("Enter amount in dollar");
        double dollar = sc.nextFloat();

        //converting dollar
        double rupee = dollar * 66;
        System.out.println("Rupees : "+f.format(rupee));
        double pound = dollar * 0.67;
        System.out.println("Pound : "+f.format(pound));
        double euro = dollar * 0.92;
        System.out.println("Euro : "+f.format(euro));
        double yen = dollar * 120.90;
        System.out.println("Yen : "+f.format(yen));
        double taka = dollar * 84.81;
        System.out.println("Taka : "+f.format(taka));

        sc.close();
    }
}

class Euro {
    DecimalFormat f = new DecimalFormat("##.###");
    Scanner sc = new Scanner(System.in);

    public void convert() {
        System.out.println("Enter amount in Euro");
        double euro = sc.nextFloat();

        //converting euro
        double rupee = euro * 72;
        System.out.println("Rupees : "+f.format(rupee));
        double dollar = euro * 1.09;
        System.out.println("Dollar : "+f.format(dollar));
        double pound = euro * 0.73;
        System.out.println("Pound : "+f.format(pound));
        double yen = euro * 131.84;
        System.out.println("Yen : "+f.format(yen));
        double taka = euro * 103.41;
        System.out.println("Taka : "+f.format(taka));

        sc.close();
    }
}

class Pound {
    DecimalFormat f = new DecimalFormat("##.###");
    Scanner sc = new Scanner(System.in);

    public void convert() {
        System.out.println("Enter amount in Pound");
        double pound = sc.nextFloat();

        //converting pound
        double rupee = pound * 98;
        System.out.println("Rupees : "+f.format(rupee));
        double dollar = pound * 1.49;
        System.out.println("Dollar : "+f.format(dollar));
        double euro = pound * 1.36;
        System.out.println("Euro : "+f.format(euro));
        double yen = pound * 179.89;
        System.out.println("Yen : "+f.format(yen));
        double taka = pound * 115.30;
        System.out.println("Taka : "+f.format(taka));

        sc.close();
    }
}

class Taka {
    DecimalFormat f = new DecimalFormat("##.###");
    Scanner sc = new Scanner(System.in);

    public void convert() {
        System.out.println("Enter amount in taka");
        double taka = sc.nextFloat();

        // converting taka
        double rupee = taka / 1.15;
        System.out.println("Rupees : "+f.format(rupee));
        double dollar = taka / 84.81;
        System.out.println("Dollar : "+f.format(dollar));
        double pound = taka / 115.20;
        System.out.println("Pound : "+f.format(pound));
        double euro = taka / 103.38;
        System.out.println("Euro : " + f.format(euro));
        double yen = taka / 0.82;
        System.out.println("Yen : "+f.format(yen));

        sc.close();
    }
}


class Yen {
    DecimalFormat f = new DecimalFormat("##.###");
    Scanner sc = new Scanner(System.in);

    public void convert() {
        System.out.println("Enter amount in Yen");
        double yen = sc.nextFloat();

        // converting yen
        double rupee = yen * 0.55;
        System.out.println("Rupees : "+f.format(rupee));
        double dollar = yen * 0.01;
        System.out.println("Dollar : "+f.format(dollar));
        double pound = yen * 0.01;
        System.out.println("Pound : "+f.format(pound));
        double euro = yen * 0.01;
        System.out.println("Euro : "+f.format(euro));
        double taka = yen * 0.82;
        System.out.println("Taka : "+f.format(taka));

        sc.close();
    }



	public static void main(String[] args) {
		
		double code;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency code" +
                " \n1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Yen" + "\n6:Taka");
        code=sc.nextInt();

        //For Rupees Conversion
        if(code == 1) {
            Rupee rp = new Rupee();
            rp.convert();
        }

        //For Dollar Conversion
        else if (code == 2) {
            Dollar dl = new Dollar();
            dl.convert();
        }

        //For Pound Conversion
        else if(code == 3) {
            Pound pd = new Pound();
            pd.convert();
        }

        //For Euro Conversion
        else if(code == 4) {
            Euro er = new Euro();
            er.convert();
        }

        //For Yen Conversion
        else if(code == 5) {
            Yen y = new Yen();
            y.convert();
        }

        // For Taka Conversion
        else if(code == 6) {
            Taka tk = new Taka();
            tk.convert();
        }
        else
            System.out.println("Invalid Code");

        sc.close();
  
    
	}

}
