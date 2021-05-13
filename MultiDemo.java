class MultiDemo
{
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Aaa", "Bbb"}
        };
        
        System.out.println(names[0][0] + names[1][0]);
        
        System.out.println(names[0][2] + names[1][1]);
    }
}