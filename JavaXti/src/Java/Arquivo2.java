package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {
	public static void main(String[] args) {
		Path path = Paths.get("C:/xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		//ESCRITA DE ARQUIVOS
		//Bufferd repositorio de dados do computador
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)){
			w.write("\nTextoooo\n");
			w.write("\nTextogggg\n");
			//w.flush();//flush grava os dados na memória do computador
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		//finally {if (w != null) {w.close();//desligar a ligação}
	//LEITURA	
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) != null) {// retorna as linhas do arquivo
				System.out.println(line);}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	
	}
	


		
		
	
