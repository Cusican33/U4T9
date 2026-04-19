import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList = new ArrayList<Integer>();

    public Digits(int num)
    {
        if (num == 0)
        {
            digitList.add(0);
        }
        else
        {
            int val = num;
            int i = 10;
            while (val != 0)
            {
                digitList.add(0, (val % i) / (i / 10));
                val -= val % i;
                i *= 10;
            }
        }
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing()
    {
        for (int i = 1; i < digitList.size(); i++)
        {
            if (digitList.get(i - 1) >= digitList.get(i)) return false;
        }
        return true;
    }
}