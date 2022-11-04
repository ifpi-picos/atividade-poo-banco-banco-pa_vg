import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EnviarEmail implements Interface {

    @Override
    public void enviarNotificacao() {
         // O ID do e-mail do destinatário precisa ser mencionado.
         String to = "java.banco.maut@gmail.com";

         // O ID do e-mail do remetente precisa ser mencionado
         String from = "java.banco.maut@gmail.com";
 
         // Supondo que você está enviando e-mail por gmails smtp
         String host = "smtp.gmail.com";
 
         // Obter propriedades do sistema
         Properties properties = System.getProperties ();
 
         // Configurar servidor de e-mail
         properties.put ("mail.smtp.host", host);
         properties.put ("mail.smtp.port", "465");
         properties.put ("mail.smtp.ssl.enable", "true");
         properties.put ("mail.smtp.auth", "true");
 
         // Obtenha o objeto Session.// e passe o nome de usuário e a senha
         Session session = Session.getInstance (properties, new javax.mail.Authenticator () {
 
             protected PasswordAuthentication getPasswordAuthentication () {
 
                 return new PasswordAuthentication ("java.banco.maut@gmail.com", "javinha01");
 
             }
 
         });
 
         // Usado para depurar problemas de SMTP
         session.setDebug (true);
 
         try {
             // Cria um objeto MimeMessage padrão.
             Message MimeMessage = new MimeMessage (null,null);
 
             // Definir De: campo de cabeçalho do cabeçalho.
             MimeMessage.setFrom (new InternetAddress (""));
 
             // Definir como: campo de cabeçalho do cabeçalho.
             MimeMessage.addRecipient (Message.RecipientType.TO, new InternetAddress (""));
 
             // Definir assunto: campo de cabeçalho
             MimeMessage.setSubject ("Banco notificaçao");
 
             // Agora defina a mensagem real
             MimeMessage.setText ("saldo");
 
             System.out.println ("enviando ...");
             // Enviar mensagem
             Transport.send (MimeMessage);
             System.out.println ("Mensagem enviada com sucesso ....");
         } catch (MessagingException mex) {
 
             mex.printStackTrace ();
         }
 
     }
        
    }
    

