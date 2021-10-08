import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        //Define arrays
        ArrayList<Interface> Devices = new ArrayList<>();
        ArrayList<String[]> Data = new ArrayList<>();

        //Reading information from file
        String file = "src/File.txt";
        Path path = Paths.get(file);
        Scanner input = new Scanner(path);
        while (input.hasNext()) {
            Data.add(input.nextLine().split(" "));
        }
        input.close();

        //Creating objects
        for (String[] j: Data) {
            switch (j[0]) {
                case "Desktop":
                    Devices.add(new Desktop(Integer.parseInt(j[1]), Double.parseDouble(j[2]), Integer.parseInt(j[3]), Double.parseDouble(j[4]), j[5], Integer.parseInt(j[6]), Integer.parseInt(j[7])));
                    break;

                case "Laptop":
                    Devices.add(new Laptop(Integer.parseInt(j[1]), Double.parseDouble(j[2]), Integer.parseInt(j[3]), Double.parseDouble(j[4]), j[5], Integer.parseInt(j[6]), Double.parseDouble(j[7]), j[8], j[9], j[10]));
                    break;

                case "Netbook":
                    Devices.add(new Netbook(Integer.parseInt(j[1]), Double.parseDouble(j[2]), Integer.parseInt(j[3]), Double.parseDouble(j[4]), j[5], Integer.parseInt(j[6]), Double.parseDouble(j[7]), j[8], j[9], j[10]));
                    break;

                case "Nettop":
                    Devices.add(new Nettop(Integer.parseInt(j[1]), Double.parseDouble(j[2]), Integer.parseInt(j[3]), Double.parseDouble(j[4]), j[5], Integer.parseInt(j[6])));
                    break;

                case "Monoblock":
                    Devices.add(new Monoblock(Integer.parseInt(j[1]), Double.parseDouble(j[2]), Integer.parseInt(j[3]), Double.parseDouble(j[4]), j[5], Integer.parseInt(j[6]), Double.parseDouble(j[7]), j[8], j[9]));
                    break;

                case "Server":
                    Devices.add(new Server(Integer.parseInt(j[1]), Double.parseDouble(j[2]), Integer.parseInt(j[3]), Double.parseDouble(j[4]), j[5], Integer.parseInt(j[6])));
                    break;

                default:
                    System.out.println("Such type of device does not exist!");
                    break;
            }
        }

        //Turning on, connecting to the Internet, turning off
        for (Interface k: Devices) {
            k.On();
            k.ConnectToInternet();
            k.Off();
        }
    }
}