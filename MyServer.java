import java.io.*;
import java.net.*;

public class MyServer
{
    public static void main(String args[])
    {
        try {
            ServerSocket serverSocket = new ServerSocket(7011);
            Socket socket = serverSocket.accept();

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            String str = dis.readUTF();
            System.out.print("message= " + str);

            serverSocket.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}