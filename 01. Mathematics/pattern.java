//SPECIAL PATTERN-----------------------------PLEASE RUN THE CODE---------------------------------------------
class Pattern{
  public static void main(String[] args){
    int n=11;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i-j==5 || i+j==15 || (i+j==5 && i>2) || (j-i==5 && i>2) || (i==j && i>=3 && i<=5) || (i+j==10 && i>=3 && i<=5) || (i-j<=5 && i>j && i+j>=5 && i+j<=15) || (i+j<=15 && i+j>=10 && j-i<=5 && i-j<=1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
  }
}
