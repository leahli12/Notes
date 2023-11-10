public class Variables {
    public int wins = 0;
    public int losses = 0;
    public String coach;
    public String league;
    public double winPercentage;
    public boolean makePlayoff;

    // Main method declaration
    // Used to call the constructor method to set up the class
    public static void main(String[] args) {
        Variables myCode = new Variables();
    }
    // Constructor method
    // Similar to the go method from Geoworld
    // Constructor: method that has no return type and has the exact same name as the class
    public Variables(){
        System.out.println("The season begins");
        coach = "Coach Kane";
        wins += 10;
        System.out.println("We have won " + wins + " games.");
        // Calling the playoffs method
        playoffs(wins);
        String cheer = "Rah rah shish kebab!";
    }
    // This is a method called playoffs, determine if we make the playoffs
    public void playoffs(int wins){
        if (wins >= 9){
            makePlayoff = true;
            System.out.println("You made the playoffs!");
        }
        else {
            makePlayoff = false;
            System.out.println("Better luck next time :(");
        }
    }
}