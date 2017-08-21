package others;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhumengqi on 17-8-7.
 * 5个台阶，一次只能走1或2或3个，问所有走法。
 * 深度优先遍历，暴力；
 */
public class Louti {
    private static void find(int total, List<Integer> each){
        for (int i = 0; i < each.size(); i++) {
            int curFirstStep = each.get(i);
            // TODO: 当前
        }
    }

    public static void main(String[] args) {
        int[] everyStep = {1,2,3};
        List<Integer> everyStepList = new ArrayList<>();
        everyStepList.add(1);
        everyStepList.add(2);
        everyStepList.add(3);
        find(5, everyStepList);
    }
}
