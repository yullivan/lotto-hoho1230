package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoPurchase {
    private int money;
    private LottoGame game;

    String purchase(int money){
        int count=money/1000;
        for (int i = 0; i < count; i++) {
            //LottoGame lottoGame = new LottoGame();
            System.out.println(new LottoGame().getGameNum());
        }
        return count +"개 구매 완료";
    }


}
