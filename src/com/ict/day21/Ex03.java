package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// 코로나 접종
public class Ex03 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		String pathname = "D:/oing/util/webPage03.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL(
					"https://raw.githubusercontent.com/paullabkorea/coronaVaccinationStatus/main/data/data.json" );

			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			String msg = null;
			StringBuffer sb = new StringBuffer();

			while ((msg = br.readLine()) != null) {
				System.out.println(msg + "\n");
				sb.append(msg + "\n");
			}
			System.out.println(sb.toString());
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
