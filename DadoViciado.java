/**
 * @author Filipe Queiroz
 * 
 * @see Sorteio anuncia que é um sorteio
 * @see GeradorNumero
 * 
 * @see <a href="https://lms.ebaconline.com.br/lesson/e1c4b7f4-5db9-4855-9259-de6629ad1cdc">
 */

public class DadoViciado {
    public static void main(String[] args) {
        Sorteio sorteio = new Sorteio();
        GeradorNumero geradorNumero = new GeradorNumero();
        geradorNumero.setResultado("4");
        System.out.println(sorteio.anunciaSorteio() + " " + geradorNumero.getResultado());
        System.out.println("Este dado esta viciado, sempre ira cair o mesmo resultado");
    }
}
