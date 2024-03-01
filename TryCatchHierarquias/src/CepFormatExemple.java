public class CepFormatExemple {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("13484120");
            System.out.println(cepFormatado);
        } catch (CepInvalidExeption e) {
            // TODO Auto-generated catch block
            System.out.println("o Cep não corresponde as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidExeption{
        if  (cep.length() != 8 )
            throw new CepInvalidExeption();
        
        return "13.484-120";

    }
}
class CepInvalidExeption extends Exception{}