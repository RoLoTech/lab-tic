package labTic.services;


import labTic.services.exceptions.ClientAlreadyExists;
import labTic.services.exceptions.InvalidClientInformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.fail;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClientTest {

    @Autowired
    ClientService cs;

    @Test
    public void testBasic()  {


        try {
            cs.addClient("Sebastian", "Cura", "sebastiancura97@gmail.com");
        } catch (InvalidClientInformation invalidClientInformation) {
            invalidClientInformation.printStackTrace();
        } catch (ClientAlreadyExists clientAlreadyExists) {
            clientAlreadyExists.printStackTrace();
        }


        // Se prueba agregar el mismo cliente con la cedula


        try {
            cs.addClient("Sebastian", "Cura","sebastiancura97@gmail.com");
        } catch (InvalidClientInformation invalidClientInformation) {
            invalidClientInformation.printStackTrace();
        } catch (ClientAlreadyExists clientAlreadyExists) {
            clientAlreadyExists.printStackTrace();
        }


        // Ok flujo correcto

    }


}
