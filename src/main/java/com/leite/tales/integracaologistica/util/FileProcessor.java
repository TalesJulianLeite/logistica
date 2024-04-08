package com.leite.tales.integracaologistica.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileProcessor {

	@Autowired
	private File fileCopy;

	public boolean readFile(MultipartFile file) throws IOException {
		boolean fileProcessed = false;
		InputStream resource = new ClassPathResource(
				"uploadFiles/dataCopy.txt").getInputStream();
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(resource)) ) {
			String fileContent = reader.lines()
					.collect(Collectors.joining("\n"));
			
		}
		catch(IOException ex) {
			new IOException("Erro ao realizar leitura do arquivo");
		}

	if(Objects.equals(file, fileCopy)) {
	}

		return fileProcessed;

	}

}
