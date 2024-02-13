package org.example;

import java.io.IOException;

import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("resources/logfile.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            List<Progression> deserializeProgressionList = getProgressions();

            for (Progression progression : deserializeProgressionList) {
                progression.reset();
                logger.info("Progression terms:");
                Integer term = progression.next();

                while (term != null) {
                    logger.info(String.valueOf(term));
                    term = progression.next();
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Progression> getProgressions() {
        ProgressionFileManager fileManager = new ProgressionFileManager("resources/data.csv", logger);
        SerializeProgressions serializeProgressions = new SerializeProgressions("resources/data.bin", logger);
        DeserializeProgressions deserializeProgressions = new DeserializeProgressions("resources/data.bin", logger);

        List<Progression> progressionList = fileManager.readProgressionFromCSV();
        serializeProgressions.serializeProgressions(progressionList);
        List<Progression> deserializeProgressionList = deserializeProgressions.deserializeProgressions();

        return deserializeProgressionList;
    }
}