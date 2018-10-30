package com.ebay.app.managers;

import com.ebay.app.dataProviders.ConfigFileReader;

public class FileReaderManager {

    private static FileReaderManager _fileReaderManager = new FileReaderManager();
    private static ConfigFileReader _configFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance() {
        return _fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (_configFileReader == null) ? new ConfigFileReader() : _configFileReader;
    }
}
