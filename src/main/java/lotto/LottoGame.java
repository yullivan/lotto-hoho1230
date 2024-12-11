package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGame {
    private List<LottoNumber> sixNumber;


    List<Integer> getGameNum() {
        List<Integer> number = new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            number.add(i);
        }
            Collections.shuffle(number);
            ArrayList<Integer> sixNum = new ArrayList<>(number.subList(0, 6));
            Collections.sort(sixNum);
        return sixNum;
    }




}
