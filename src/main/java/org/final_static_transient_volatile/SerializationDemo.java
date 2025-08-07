package org.final_static_transient_volatile;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User u1 = new User(1,"Deepika","12345");

        // Serialize the object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        /* FileOutputStream("user.ser")
                1. Creates a file named user.ser (if not exists)
                2. Opens a binary output stream to that file
                3. Writes raw bytes to disk
            new ObjectOutputStream(...)
            1. Wraps the FileOutputStream
            2. Enables writing Java objects to the stream, not just bytes*/
        oos.writeObject(u1);
     /* Checks if the object is Serializable :(User implements Serializable)
         Recursively converts the object (and its fields) into a binary format:
         Includes object metadata (class name, fields, values)
         Writes it to the file user.ser in a portable format (Java’s own format) */
        oos.close();

        // Simulate restart
        System.out.println("Serialized: " + u1);

        // Deserialize the object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        /* FileInputStream("user.ser"):
                Opens the binary file for reading
                Reads raw bytes into memory
           new ObjectInputStream(...):
                Wraps the FileInputStream
                Can now read Java objects from the stream
         */
        User loaded = (User) ois.readObject();
        /* JVM reads the stream metadata (headers, class info, fields)
            Uses Java’s internal serialization protocol to:
            Create a new User object (bypassing constructor)
            Populate it with the saved field values
            Restores the object exactly as it was (except transient/static fields)
         */
        ois.close();

        // Output after deserialization
        System.out.println("Deserialized: " + loaded);

    }
}
