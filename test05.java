class test05 {

    public static void main(String[] args) {

        String[][] x = new String[3][2];

        for (int i = 0; i < 3; i++) {
            for (int check = 0; check <= 1; check++) {
                    switch(i){
                        case 0:         // s0
                            if (check == 1) {
                                 x[i][check] = "s0";
                            }else{
                                   x[i][check] = "s1";
                            } 
                            break;
                        case 1:         // s1
                            if (check == 1) {
                                if (check == 1) {
                                    x[i][check] = "s2";
                                }
                            }else{
                                    x[i][check] = "s1";
                            }
                            break;
                        case 2 :        // s2
                            if (check == 1) {
                                    if (check == 1) x[i][check] = "s0";
                            }else{
                                    if(check == 0) x[i][check] = "s1";
                            }
                            break;           
                    }
            }
        }

        System.out.println("\t\t 0\t 1");
        for(int i=0;i<3;i++){
            System.out.print("\tS"+i);
                for(String s:x[i]){
                    System.out.print("\t"+s);
                }
            System.out.println("");

        }








    }
}