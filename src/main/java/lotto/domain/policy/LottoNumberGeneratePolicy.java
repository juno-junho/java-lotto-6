package lotto.domain.policy;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class LottoNumberGeneratePolicy implements NumberGeneratePolicy {

    private static final int LOTTO_NUM_SIZE = 6;
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 45;

    @Override
    public List<Integer> generate() {
        return Randoms.pickUniqueNumbersInRange(MIN_NUM, MAX_NUM, LOTTO_NUM_SIZE);
    }

}
