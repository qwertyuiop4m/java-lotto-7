package lotto.service;

import lotto.model.Lotto;
import lotto.model.PurchaseAmount;
import lotto.utils.RandomNumberGenerator;

import java.util.List;
import java.util.random.RandomGenerator;

public class LottoMachine {
    private final PurchaseAmount purchaseAmount;
    private final List<Lotto> lottos;


    public LottoMachine(PurchaseAmount purchaseAmount, List<Lotto> lottos) {
        this.purchaseAmount = purchaseAmount;
        this.lottos = lottos;
        genrateLotts();
    }

    private void genrateLotts() {
        int count= purchaseAmount.getMoney()/PurchaseAmount.LOTTE_PRICE;
        for (int i=0;i<count;i++){
            Lotto lotto = new Lotto(RandomNumberGenerator.genreateNumbers());
            lottos.add(lotto);
        }
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
}