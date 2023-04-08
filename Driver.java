import <insert package name>.PropertyDetails;

public class Driver {

    public static void main(String[] args) {

        // Data set 1
        PropertyDetails p1 = new PropertyDetails(78.7, 72.86, "RWA1");
        PropertyDetails p2 = new PropertyDetails(78.7, 72.86, "RWA1");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());  // Prints out the details of each respective property
        
        if (p1.equals(p2)) {
            System.out.println("You are comparing the same properties.\n");
        }  // Prints that both properties are the same
        
        else {
            boolean sameDimen = p1.compDimens(p2);
            System.out.println("You are not comparing the same properties.");
            
            if (sameDimen) {
                System.out.println("The two properties have the same dimensions.\n");
            } 
            
            else {
                System.out.println("The two properties do not have the same dimensions.\n");
            }  // Checks and prints whether the properties are the same and if they have the same dimensions
        }

        
        
        // Data set 2
        p1 = new PropertyDetails(78.7, 72.86, "RWA1");
        p2 = new PropertyDetails(59.8, 53.93, "RYT0");  // Changes both of the properties to the next data set

        System.out.println(p1.toString());
        System.out.println(p2.toString());  // Prints out the details of each respective property

        if (p1.equals(p2)) {
            System.out.println("You are comparing the same properties.\n"); // Prints that both properties are the same
        } 
        
        else {
            boolean sameDimen = p1.compDimens(p2);
            System.out.println("You are not comparing the same properties.");
            
            if (sameDimen) {
                System.out.println("The two properties have the same dimensions.\n");
            } 
            
            else {
                System.out.println("The two properties do not have the same dimensions.\n");
            }  // Checks and prints whether the properties are the same and if they have the same dimensions
        }

        
        
        // Data set 3
        p1 = new PropertyDetails(78.7, 72.86, "RWA1");
        p2 = new PropertyDetails(78.7, 72.86, "RYT0");  // Changes both of the properties to the next data set

        System.out.println(p1.toString());
        System.out.println(p2.toString());  // Prints out the details of each respective property

        if (p1.equals(p2)) {
            System.out.println("You are comparing the same properties.\n"); // Prints that both properties are the same
        }
        
        else {
            boolean sameDimen = p1.compDimens(p2);
            System.out.println("You are not comparing the same properties.");
            
            if (sameDimen) {
                System.out.println("The two properties have the same dimensions.\n");
            } 
            
            else {
                System.out.println("The two properties do not have the same dimensions.\n");
            }  // Checks and prints whether the properties are the same and if they have the same dimensions
        }

        
        
        // Data set 4
        p1 = new PropertyDetails(78.7, 72.86, "RWA1");
        p2 = new PropertyDetails(59.8, 53.93, "RWA1");  // Changes both of the properties to the next data set

        System.out.println(p1.toString());
        System.out.println(p2.toString());  // Prints out the details of each respective property

        if (p1.equals(p2)) {
            System.out.println("You are comparing the same properties.\n"); // Prints that both properties are the same
        }
        
        else {
            boolean sameDimen = p1.compDimens(p2);
            System.out.println("You are not comparing the same properties.");
            
            if (sameDimen) {
                System.out.println("The two properties have the same dimensions.\n");
            } 
            
            else {
                System.out.println("The two properties do not have the same dimensions.\n");
            } // Checks and prints whether the properties are the same and if they have the same dimensions
        }
        
    }
}
