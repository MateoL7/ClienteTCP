package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {

			System.out.println("Enviando solicitud...");

			//Socket es la puerta de conexion o comunicacion
			//Para conectarme conmigo mismo
			Socket socket = new Socket("127.0.0.1", 5000);
			
			//Para conectarse con conmpañeros y profesor ngrok
			//Socket socket = new Socket("0.tcp.ngrok.io", 10828);
			
			System.out.println("Conectados");
			
			String path = "D:/Test/Recibidos/java.pdf";
			File recieved = new File(path);
			
			
			InputStream is = socket.getInputStream();
			FileOutputStream fos = new FileOutputStream(recieved);
			
			byte[] buffer = new byte[256];
			int readBytes = 0;
			
			while((readBytes = is.read(buffer)) != -1) {
				fos.write(buffer,0,readBytes);
			}
			
			fos.close();
			is.close();
			
			while(true) {}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			//ESTO LO USAMOS PARA LO DEL MENSAJE A MI MISMO
//			Scanner sc = new Scanner(System.in);
//			OutputStream os = socket.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(os);
//			BufferedWriter bw = new BufferedWriter(osw);
//
//			InputStream is = socket.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//
//			while(true) {
//
//				System.out.println("-----//-----//-----");
//				System.out.println("Escribe el mensaje: ");
//				String line = sc.nextLine();
//				//Enviar mensaje
//				bw.write(line + "\n");
//				bw.flush();
//
//				//Recibir respuesta
//				String serverAnswer = br.readLine();
//				System.out.println("Respuesta del Servidor: " + serverAnswer);
//			}



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
