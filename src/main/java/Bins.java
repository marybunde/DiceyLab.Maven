
public class Bins {
    int [] bin;

    public Bins(int high) {
        int [] arrBin = new int[high + 1];
        this.bin = arrBin;
    }
    public void incrementBin(int index) {
        bin[index] ++;
    }
    public Integer getBin(Integer index){
        return bin[index];
    }
}
