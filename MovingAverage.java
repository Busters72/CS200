import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int n = 1;
        ArrayList<Double> averageList = new ArrayList<>();
/*
        if (list == null || list.isEmpty())
        {
            return averageList;
        }
*/
        double average = 0.0;
        double sum = 0.0;
        int numOfNums = 0;
        int start = 0;

        for (int i = 0; i < list.size() + 1; ++i)
        {
            start = i - n;
            while (start < 0)
            {
                ++start;
            }
            for (int j = start; j < i; ++j)
            {
                ++numOfNums;
                sum += list.get(j);
            }
            if(numOfNums != 0) {
                average = sum / numOfNums;
                averageList.add(average);
            }
        }    }
}
