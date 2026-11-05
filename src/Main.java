public class Main {
    public static void main(String[] args){
        int opcion = -1;
        do{
            opcion = Utils.validaInt(menu());
        }while(opcion != 0);
    }
    public static String menu(){
        return """
                Menu de repoositorio
                ---------------------
                Pulse 0 para salir
                :
                """;
    }
}
