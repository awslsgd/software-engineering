public class Output {

    public static void main(String[] args) {
        int x,y;
        int count=0;
        for(x=2;x<=200;x++) {
            boolean flag=true;
            for(y=2;y<x;y++) {
                if(x%y==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                count++;
                System.out.print(y+"\t");
                if(count%5==0)
                    System.out.println();
            }
        }
    }
}