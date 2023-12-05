import java.util.ArrayList;

public class Binary {
    private int decimal;
    private ArrayList<Integer> binary = new ArrayList<Integer>();
    private int[] referenzBinZahlen = {128,64,32,16,8,4,2,1};

    public Binary(int decimal) {
        this.decimal = decimal;
    }

    public Binary(ArrayList<Integer> binary) {
        this.binary = binary;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public ArrayList<Integer> getBinary() {
        return binary;
    }

    public void setBinary(ArrayList<Integer> binary) {
        this.binary = binary;
    }

    public void convertToBinary() {
        int temp = decimal;
        while (temp > 0) {
            if (temp % 2 != 0) {
                this.binary.add(0, 1);
            } else {
                this.binary.add(0, 0);
            }
            temp = temp / 2;
        }
    }

    public void convertToDecimal() {
        int temp = 0;
        for(int i = 0; i< binary.size(); i++){
            if (binary.get(i) == 1){
                temp += referenzBinZahlen[i];
            } else {
                temp = temp;
            }
        }
        this.decimal = temp;
    }
}
