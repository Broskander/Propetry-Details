public class PropertyDetails {
	
	private double length;
	private double width;
	private String pID;  // Variables for class Property Details
	
	public PropertyDetails(double length, double width, String pID) {
        this.length = length;
        this.width = width;
        this.pID = pID;
	}
    
	// Setters
	
	public void setLength(double length) {
        this.length = length;
	}
        
    public void setWidth(double width) {
    	this.width = width;
    }
    
    public void setPID(String pID) {
    	this.pID = pID;
    }
    
    // Getters
    
    public double getLength() {
    	return length;
    }
    
    public double getWidth() {
    	return width;
    }
    
    public String getPID() {
    	return pID;
    }
    
    // Returns the area of the length and width
    public double area() {
    	return length * width;
    }
    
    public boolean equals(PropertyDetails object) {
    	
        return this.pID.equals(object.getPID());
    }
    
    public boolean compDimens(PropertyDetails object) {
    	
    	if (!this.pID.equals(object.getPID())) {
    		
    		if ((this.length == object.getLength() && this.width == object.getWidth())) {
    			return true;
            } 
    		
    		else if ((this.length == object.getWidth() && this.width == object.getLength())) {
    			return true;
    		}  // Using the else if for both scenarios of whether the length is equal to windth OR length, and vice versa
    		
    		else {
                return false;
            }
    		
        } 
    	
    	else {
            return false;
        }  // If the user is not comparing the same property, it returns a boolean for whether or not the properties have the same dimensions
    	
    	
    }
 
    public String toString() {
    	return ("Property " + pID + " with length " + String.format("%.2f", length) + ", width " +
                String.format("%.2f", width) + ", and area " + String.format("%.2f", area()));
    }  // Returns as a string with the dedicated text using String.format 
 }
