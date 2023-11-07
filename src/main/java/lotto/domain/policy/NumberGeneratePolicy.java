package lotto.domain.policy;

import java.util.List;

@FunctionalInterface
public interface NumberGeneratePolicy {

    List<Integer> generate();

}