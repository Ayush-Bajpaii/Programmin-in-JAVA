public class array {
    public static void main(String args[]){
        int[] myarr = new int[6];
        myarr[0] = 14;
        myarr[1] = 15;
        myarr[2] = 16;
        myarr[3] = 17;
        myarr[4] = 18;
        myarr[5] = 19;

//	System.out.println(myarr[0]);
//	System.out.println(myarr[1]);
//	System.out.println(myarr[2]);
//	System.out.println(myarr[3]);
//	System.out.println(myarr[4]);
//	System.out.println(myarr[5]);
        int index = 0;
        while(index<myarr.length){
            System.out.println(myarr[index]);
            index++;
        }
        System.out.println(myarr.length);

    }
}
