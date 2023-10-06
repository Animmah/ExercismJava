import java.util.*;

class PythagoreanTriplet {
    int a,b,c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sum=0,maxFactor=0;
        List<PythagoreanTriplet> triplets=new ArrayList<>();
        TripletListBuilder thatSumTo(int sum) {
            this.sum=sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor=maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            if(maxFactor==0)
                maxFactor=sum/2;
            for(int i=1;i<=maxFactor;i++){
                for(int j=i;j<=maxFactor;j++){
                    int k=sum-i-j;
                    if(k<=maxFactor && k*k==i*i+j*j)
                        triplets.add(new PythagoreanTriplet(i,j,k));
                }
            }
            return triplets;
        }

    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PythagoreanTriplet other)
            return this.hashCode() == other.hashCode();

        return false;
    }
}