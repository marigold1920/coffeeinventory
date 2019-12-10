package coffee.inventory.strategy;

import coffee.inventory.chain.PipeLineManager;
import coffee.inventory.enumeration.Level;

public class ReceiptAlgorithms implements TransactionAlgorithms {

    public void init(PipeLineManager initiator) {
        initiator.doPipeLine(Level.CATEGORY);
    }

}