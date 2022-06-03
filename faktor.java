import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        int i,j,k, n, r,m, totali, totalj,totalk;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir 'n' Sayisi gir:");
        n = inp.nextInt();
        System.out.print("Bir 'r' Sayisi gir:");
        r = inp.nextInt();
        totali = 1;
        totalj = 1;
        totalk = 1;
        m=n-r;
        for (i = 1; i <= n; i++) {
            totali *= i;

        }
        for(j=1;j <= r;j++){
            totalj*=j;

        }
        for(k=1;k<=m;k++){
            totalk*=k;
        }
        double cp;
        cp= totali/(totalj*totalk);
        System.out.print("CP(n,r) Denkleminin Sonucu :");
        System.out.print(cp);




    }
}
