
public enum Level1 {
    HIGH{
        @Override
        public String asLowerCase() {
            return HIGH.toString().toLowerCase();
        }
    },
    MEDIUM{
        @Override
        public String asLowerCase() {
            return MEDIUM.toString().toLowerCase();
        }
    },
    LOW{
        @Override
        public String asLowerCase() {
            return LOW.toString().toLowerCase();
        }
    };

    public abstract String asLowerCase();

 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level1 level = Level1.HIGH;


	}

}
