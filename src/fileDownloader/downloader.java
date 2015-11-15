package fileDownloader;

import java.net.*;
import java.io.*;

public class downloader {

	public static void main(String[] args) throws IOException {
		
		String fileName = "file.txt";
		String url = "http://shayconcepts.com";
		URL link = new URL(url);
		InputStream in = new BufferedInputStream(link.openStream());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1!=(n=in.read(buf)))
		{
		    out.write(buf, 0, n);
		}
		out.close();
		in.close();
		byte[] response = out.toByteArray();
		
		FileOutputStream fos = new  FileOutputStream(fileName);
		fos.write(response);
		fos.close();
		System.out.println("Done");
		
		
	}

}

		

