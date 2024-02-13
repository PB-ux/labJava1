package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializeProgressions {
    public String filename;
    private Logger logger;

    SerializeProgressions(String filename, Logger logger) {
        this.filename = filename;
        this.logger = logger;
    }

    public void serializeProgressions(List<Progression> progression) {
        try {
            FileOutputStream fos = new FileOutputStream(this.filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(progression);
            oos.flush();
            oos.close();
            logger.info("Progressions serialized successfully to " + filename);
        } catch(IOException e) {
            logger.log(Level.SEVERE, "Serialization failed", e);
            e.printStackTrace();
        }
    }
}
