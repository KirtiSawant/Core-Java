
public class Spaceship implements Comparable<Spaceship> {
	

    private String spaceshipClass = null;
    private String registrationNo = null;

    public Spaceship(String spaceshipClass, String registrationNo) {
        this.spaceshipClass = spaceshipClass;
        this.registrationNo = registrationNo;
    }

    @Override
    public int compareTo(Spaceship other) {
        int spaceshipClassComparison =
                this.spaceshipClass.compareTo(other.spaceshipClass);

        if(spaceshipClassComparison != 0) {
            return spaceshipClassComparison;
        }
        
        return this.registrationNo.compareTo(other.registrationNo);
    }
    public static void main(String[] args) {
    	Spaceship s=new Spaceship("A");
    	s.Spaceship();
    }
    }
	
}    
	
