package ch.heigvd.res.labs.roulette.net.protocol;

import java.io.ByteArrayOutputStream;

/**
 * This class is used to serialize/deserialize the response sent by the server
 * when processing the "BYE" command defined in the protocol specification. The
 * JsonObjectMapper utility class can use this class.
 *
 * @author Arnold von Bauer Gauss
 */
public class ByeResponse {

    private String status;
    private int numberOfCommands;

    public ByeResponse() {}

    public ByeResponse(String status, int numberOfCommands) {
        this.status = status;
        this.numberOfCommands = numberOfCommands;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public int getNumberOfCommands() { return numberOfCommands; }

    public void setNumberOfCommands(int numberOfCommands) { this.numberOfCommands = numberOfCommands; }
}
