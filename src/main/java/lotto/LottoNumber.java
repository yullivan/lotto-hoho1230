package lotto;

import java.util.*;

public class LottoNumber {
    private int number;

    //로또 번호 생성 조건 만들기
    public LottoNumber(int number) {
        if(number>0&&number<46) {
            this.number = number;
        }
        else throw new IllegalArgumentException("번호 입력 잘못됨");
    }

    public int getNumber() {
        return number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber number1 = (LottoNumber) o;
        return number == number1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}


