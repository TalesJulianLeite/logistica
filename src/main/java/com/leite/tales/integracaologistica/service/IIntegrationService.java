package com.leite.tales.integracaologistica.service;

import java.nio.file.Path;

import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Resource;

public interface IIntegrationService {
	void init();

	void store(MultipartFile file);

	String loadAll();

	Path load(String filename);

	Resource loadAsResource(String filename);

	void deleteAll();

}
