package SimpleServerClient;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class GreetClientTest {
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        TestCase.assertEquals("hello client", response);
    }
}