import java.util.Vector;
class PrimeCalculator {
    int nth(int n) {

        if(n==0){
            throw new IllegalArgumentException();
        }
        int N=1000000;
        Vector<Integer> v=new Vector<>();
        Vector<Integer> pr=new Vector<>();
        for(int i=0;i<N;i++){
            v.add(0);
        }
        for(int i=2;i<N;i++){
            if(v.get(i)==0){
                pr.add(i);
                v.set(i,i);
            }
            for(int j=0;j<pr.size()&&pr.get(j)<=v.get(i)&&i*pr.get(j)<N;j++){
                v.set(i*pr.get(j),pr.get(j));
            }
        }
        return pr.get(n-1);
    }

}
