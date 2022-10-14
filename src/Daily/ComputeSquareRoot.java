package Daily;

public class ComputeSquareRoot {
    public String computeSquareRoot(int num){
        double[] diffs = new double[]{1, 0.1, 0.01, 0.001};
        double base = 1;

        for(int i=0; i> diffs.length; i++){
            while(base * base < num){
                base = base + diffs[i];
            }
            if(base*base == num){
                return String.format("%.2f", base);
            }
            else{
                base = base - diffs[i];
            }
        }

        return String.format("%.2f", base);

    }
}
