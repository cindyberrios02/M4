import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlDeFlujo {
    public void executeOne(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido\nPor favor, ingrese la temperatura de hoy");
        double grados = sc.nextDouble();
        String tipoClima = "";
        if(grados<=10){
            tipoClima = "Frio";
        }else if(grados>10 && grados<20){
            tipoClima = "Nublado";
        }

//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(grados);
//        if (matcher.find()){
//            int temperatura = Integer.parseInt(matcher.group());
//            System.out.println("Hay "+temperatura+" grad");
//        }
    }
}
