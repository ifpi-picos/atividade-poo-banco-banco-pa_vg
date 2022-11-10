public class EnviarSmS implements Notificacao {

    String opera;
    double opavalor;

    @Override
    public void enviarNotificacao(String opera,double opavalor) {
        // TODO Auto-generated method stub
        System.out.println("o valor "+opavalor+"foi"+opera);
        
    }
    
}
