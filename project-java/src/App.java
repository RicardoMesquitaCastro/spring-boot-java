public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Ricardo";
        String segundoNome = "Mesquita";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }   
}
