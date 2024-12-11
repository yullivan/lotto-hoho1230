package lotto;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ApplicationTests {

    @Test
    void 넘버생성확인() {
        LottoNumber num = new LottoNumber(5);

        assertThat(num.getNumber()).isEqualTo(5);
        assertThatThrownBy(()->new LottoNumber(46)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 로또리스트생성확인() {
        //System.out.println(new LottoGame().getGameNum(2));
        System.out.println(new LottoGame().getGameNum());

    }

}
