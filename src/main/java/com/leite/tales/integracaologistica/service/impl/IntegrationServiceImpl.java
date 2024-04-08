package com.leite.tales.integracaologistica.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.leite.tales.integracaologistica.infrastructre.IntegrationProperties;
import com.leite.tales.integracaologistica.service.IIntegrationService;
import com.leite.tales.integracaologistica.util.exception.StorageException;

import jakarta.annotation.Resource;

@Service
public class IntegrationServiceImpl implements IIntegrationService {
	
	@Autowired
	private final Path rootLocation;

	public IntegrationServiceImpl(IntegrationProperties properties) {
        
        if(properties.getLocation().trim().length() == 0){
            throw new StorageException("File upload location can not be Empty."); 
        }

		this.rootLocation = Paths.get(properties.getLocation());
	}


	@Override
	public void store(MultipartFile file) {
		File fileCopy = null;
		try {
			if (file.isEmpty()) {
				throw new StorageException("Failed to store empty file.");
			}
			fileCopy = new File("src/main/resources/uploadFiles/targetFile.txt");

			file.transferTo((File) file);
			Path destinationFile = this.rootLocation.resolve(
					Paths.get(file.getOriginalFilename()))
					.normalize().toAbsolutePath();
			if (!destinationFile.getParent().equals(this.rootLocation.toAbsolutePath())) {
				// This is a security check
				throw new StorageException(
						"Cannot store file outside current directory.");
			}
			try (InputStream inputStream = file.getInputStream()) {
				Files.copy(inputStream, destinationFile,
					StandardCopyOption.REPLACE_EXISTING);
			}
			
		}
		catch (IOException e) {
			throw new StorageException("Failed to store file.", e);
		}
		/*
		if(Objects.nonNull(fileCopy) && fileCopy.) {
			fileCopy = (File) file;
		}
		*/
	}

	@Override
	public Path load(String filename) {
		return rootLocation.resolve(filename);
	}

	@Override
	public Resource loadAsResource(String filename) {
		/*
		try {
			ResourceReader resource = new ResourceReader();
			
			if (resource.shareable()|| ((AbstractFileResolvingResource) resource).isReadable()) {
				return resource;
			}
			else {
				throw new StorageFileNotFoundException(
						"Could not read file: " + filename);

			}
		}
		catch (MalformedURLException e) {
			throw new StorageFileNotFoundException("Could not read file: " + filename, e);
		}
		*/
		return null;
	}

	@Override
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(rootLocation.toFile());
	}

	@Override
	public void init() {
		try {
			Files.createDirectories(rootLocation);
		}
		catch (IOException e) {
			throw new StorageException("Could not initialize storage", e);
		}
	}

	@Override
	public String loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
