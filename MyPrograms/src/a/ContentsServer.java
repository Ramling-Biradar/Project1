package a;
import java.net.*;
import java.io.*;
public class ContentsServer {

	public static void main(String[] args)throws Exception {
		ServerSocket sersock=new ServerSocket(4000);
		System.out.println("Server is ready for the connection");
		Socket sock=sersock.accept();
		System.out.println("Connection is succesfull and waiting for chatting");
		InputStream istream=sock.getInputStream();
		BufferedReader fileread=new BufferedReader(new InputStreamReader(istream));
		String fname=fileread.readLine();
		BufferedReader ContentRead=new BufferedReader(new FileReader(fname));
		OutputStream ostream=sock.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream,true);
		String str;
		while((str=ContentRead.readLine())!=null) {
			pwrite.print(str);
		}
		sock.close();
		sersock.close();
		pwrite.close();
		fileread.close();
		ContentRead.close();
         

	}

}
