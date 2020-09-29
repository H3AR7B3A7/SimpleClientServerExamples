package EchoServerMultiClient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchoMultiClientTest {

    @Test
    public void givenClient1_whenServerResponds_thenCorrect() {
        createClientTestActivity();
    }

    @Test
    public void givenClient2_whenServerResponds_thenCorrect() {
        createClientTestActivity();
    }

    @Test
    public void givenClient3_whenServerResponds_thenCorrect() {
        createClientTestActivity();
    }

    private void createClientTestActivity() {
        EchoMultiClient client = new EchoMultiClient();
        client.startConnection("127.0.0.1", 5555);
        String msg1 = client.sendMessage("hello");
        String msg2 = client.sendMessage("world");
        String terminate = client.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
        client.stopConnection();
    }
}