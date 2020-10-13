public class Candy extends DessertItem {
	private double perPound;
	private double weight;
	private int calories;
	
	public Candy(){
		this(0,0,0);
    }

    public Candy(double weight, double perPound, int calories){
        this.weight = weight;
        this.perPound = perPound;
        this.calories = calories;
    }
    
    public int getCost() {
    	return (int)(weight*perPound);
    }
    
    public void setCalories(int calories) {
    	this.calories = calories;
    }
    public int getCalories() {
    	return this.calories;
    }
    
    public String toString() {
    	return getName() + " weights " +weight + "lbs @ " +perPound + " /lb " 
    			+ " making the total cost " + getCost(); 
    }
    
    
}
