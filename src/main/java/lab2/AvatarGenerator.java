package lab2;
// Import required packages
import javax.imageio.ImageIO;// For reading and writing images
import javax.swing.*;// For creating and managing GUI components like JFrame and JLabel

import java.awt.*;  // For basic GUI components like colors and layouts
import java.io.IOException;// For handling IO exceptions like file reading errors
import java.io.InputStream;// For handling input streams, such as image data streams
import java.net.URI;// For handling input streams, such as image data streams
import java.net.http.HttpClient;// For making HTTP requests
import java.net.http.HttpRequest;// For creating HTTP requests
import java.net.http.HttpResponse;// For handling HTTP responses

public class AvatarGenerator {
    // Main method - entry point of the program
    public static void main(String[] args) {

        try {
            // Fetch a random avatar image stream from the API
            var avatarStream = AvatarGenerator.getRandomAvatarStream(); // Method: Class method that fetches a random avatar image strea
            AvatarGenerator.showAvatar(avatarStream);  // Method: Class method that displays the avatar in a window.
        } catch (IOException | InterruptedException e) {
            // Print stack trace if there is an error in fetching or displaying the avatar
            e.printStackTrace();
        }

    }
    // class:Method to fetch a random avatar image stream from the DiceBear API
    public static InputStream getRandomAvatarStream() throws IOException, InterruptedException {
        // Pick a random style
        String[] styles = { "adventurer", "adventurer-neutral", "avataaars", "big-ears", "big-ears-neutral", "big-smile", "bottts", "croodles", "croodles-neutral", "fun-emoji", "icons", "identicon", "initials", "lorelei", "micah", "miniavs", "open-peeps", "personas", "pixel-art", "pixel-art-neutral" };
        var style = styles[(int)(Math.random() * styles.length)]; // Select a random style from the list of styles

        // Generate a random seed
        var seed = (int)(Math.random() * 10000); // Create a URI to the API with the selected style and seed

        // Create an HTTP request for a random avatar
        var uri = URI.create("https://api.dicebear.com/9.x/%s/png?seed=%d".formatted(style, seed));
        var request = HttpRequest.newBuilder(uri).build(); // class: method Creates a new HttpRequest.Builder.
       // Package: java.net.http. Purpose: Represents an HTTP request.
        // Send the request
        try (var client = HttpClient.newHttpClient()) { //Creates a new HttpClient for sending requests.
            // Send the HTTP request and return the InputStream of the response (the avatar image)
            var response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            return response.body();
        }
    }
    // Method to display the avatar image in a GUI window
    public static void showAvatar(InputStream imageStream) {
        //Package: javax.swing. Purpose: A window to display GUI components.
            JFrame frame = new JFrame("PNG Viewer");// Create a new JFrame window to display the image
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Instance method. Close the program when the window is closed
            frame.setResizable(false);// Disable resizing of the window
            frame.setSize(200, 200);// Set the window size to 200x200 pixels
            frame.getContentPane().setBackground(Color.BLACK);// Set the background color to black

            try {// Read the image from the InputStream
                // Load the PNG image
                Image image = ImageIO.read(imageStream);

                // Create a JLabel to display the image
                JLabel imageLabel = new JLabel(new ImageIcon(image));
                // Add the image label to the frame's content pane (center of the window)
                frame.add(imageLabel, BorderLayout.CENTER);

            } catch (IOException e) {
                // If there is an error reading the image, print the stack trace
                e.printStackTrace();
            }
// Make the frame visible so the user can see the image
            frame.setVisible(true);
    }
}
// styles[] — String[] (reference type)
//style — String (reference type)
//seed — int (primitive type)
//uri — URI (reference type)
//client — HttpClient (reference type)
//response — HttpResponse<InputStream> (reference type)
//imageStream — InputStream (reference type)
//frame — JFrame (reference type)


//I identified that the argument imageStream is a reference type (InputStream), not a primitive value.