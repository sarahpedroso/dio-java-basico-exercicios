public class exercicio1 {
    public static void main (String [] args) {
        String primeiroNome = "Sarah";
        String segundoNome = "Pedroso";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}