package org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeserializeProgressions {
    public String filename;
    private Logger logger;

    DeserializeProgressions(String filename, Logger logger) {
        this.filename = filename;
        this.logger = logger;
    }

    public List<Progression> deserializeProgressions() {
        List<Progression> progressions = null;

        try {
            FileInputStream fis = new FileInputStream(this.filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            progressions = (List<Progression>) ois.readObject();
            logger.info("Progressions deserialized successfully from " + filename);
        } catch(Exception e) {
            logger.log(Level.SEVERE, "Deserialization failed", e);
            e.printStackTrace();
        }

        return progressions;
    }
}
