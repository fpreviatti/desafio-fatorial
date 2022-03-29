import java.util.Random;

public class ImplementacaoFatorial {

    public static void main(String[] args){
        try{
            ImplementacaoFatorial im = new ImplementacaoFatorial();
            Long numero = Long.valueOf((int)(Math.random() * 10));

            Long fatorial = im.calcularFatorial(numero);
            System.out.println("Valor de fatorial de " +numero +" é: " +fatorial);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    Long calcularFatorial(Long numero) throws Exception {
        Long x = numero;
        Long f = x;

        if(numero<0){
            throw new FatorialNegativoException();
        }
        else if(numero==0){
            f = 1L;
        }
        else{
            while (x > 1){
                f = f *(x-1);
                x--;
            }
        }
        return f;
    }
}
