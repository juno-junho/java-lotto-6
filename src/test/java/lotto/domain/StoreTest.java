package lotto.domain;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;

@DisplayNameGeneration(ReplaceUnderscores.class)
class StoreTest {

    @ParameterizedTest(name = "로또 가격이 {0}원이면 예외를 발생한다")
    @ValueSource(ints = {-1, 0})
    void 로또_구매_가격이_최소_로또_금액_미만이면_예외를_발생한다(int price) {
        assertThatThrownBy(() -> new Store(price))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest(name = "로또 가격이 {0}원이면 예외를 발생한다")
    @ValueSource(ints = {1001, 1500, 2001})
    void 로또_구매_가격이_최소_로또_금액으로_나누어_떨어지지_않으면_예외를_발생한다(int price) {
        assertThatThrownBy(() -> new Store(price))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest(name = "로또 가격이 {0}원이면 예외를 발생하지 않는다")
    @ValueSource(ints = {1000, 2000, 3000, 10000000, 2_100_000_000})
    void 로또_구매_가격이_최소_로또_금액_이상이고_최소_로또_금액으로_나누어_떨어지면_예외를_발생하지_않는다(int price) {
        assertThatNoException().isThrownBy(() -> new Store(price));
    }

    @Test
    void 로또_구매_가격이_21억을_넘으면_예외를_발생한다() {
        assertThatThrownBy(() -> new Store(2_100_000_001))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 로또_구매_가격에서_계산해_로또_장수_반환에_성공한다() {
        // given
        Store store = new Store(2000);

        // when
        int lottoCount = store.getLottoCount();

        // then
        assertThat(lottoCount).isEqualTo(2);
    }

}