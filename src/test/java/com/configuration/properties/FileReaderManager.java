package com.configuration.properties;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public  static FileReaderManager getFrInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}

	public ConfigurationReader getCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

}
