
  public class BadUrlException extends Exception {
        public BadUrlException(String s) {
            super(s);
        }
    
  public void storeDataFromUrl(String url){
      try {
          String data = readDataFromUrl(url);
      } catch (BadUrlException e) {
          e.printStackTrace();
      }
  }

  public String readDataFromUrl(String url)throws BadUrlException{
      if(isUrlBad(url)){
          throw new BadUrlException("Bad URL: " + url);
      }

      String data = null;
     
      return data;
  }
  
  public static void main(String[] args) {
	  
  }
  }
