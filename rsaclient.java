import java.math.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class rsaclient {
    public static void main(String args[]) {
        try {
            int i1;
            BigInteger p, q, p_n, q_n, n, fi, e, e_, d, i;
            BigInteger mesg, cipher_text, plain_text;
            BigInteger b = BigInteger.valueOf(0);
            BigInteger bi = BigInteger.valueOf(1);
            BigInteger bii = BigInteger.valueOf(2);
            // for euclidean algorithm.
            BigInteger r, t1, t2, t, qo;
            String serverName = "localhost";
            int port = 8088;

            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            Scanner sc=new Scanner(System.in);
            DataInputStream in = new DataInputStream(client.getInputStream());
            e = new BigInteger(in.readUTF());
            n = new BigInteger(in.readUTF());

            System.out.print("Enter the message to encrypt: ");
            mesg = sc.nextBigInteger();

            cipher_text = mesg.modPow(e, n);

            System.out.println("----------------------------------");
            System.out.println("Cipher Text of the entered message: ");
            System.out.println(cipher_text);
            System.out.println("----------------------------------");

            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF(cipher_text.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}