
class ArrayCopy
{
public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'k', 'i', 'r', 't', 'e',
			    'e', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 6);
        System.out.println(new String(copyTo));
    }
}	
