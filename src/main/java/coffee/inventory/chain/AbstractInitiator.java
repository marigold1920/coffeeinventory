package coffee.inventory.chain;


import coffee.inventory.adapter.TransactionAdapter;
import coffee.inventory.enumeration.Level;
import coffee.inventory.helper.PoolService;
import coffee.inventory.service.implement.TransactionServiceImpl;

public abstract class AbstractInitiator {
    
    protected Level level;
    protected AbstractInitiator nextInitiation;
    protected PoolService poolService;
    protected TransactionAdapter transactionAdapter;
    protected TransactionServiceImpl service;

    public AbstractInitiator(PoolService poolService, TransactionAdapter transactionAdapter, TransactionServiceImpl service) {
        this.poolService = poolService;
        this.transactionAdapter = transactionAdapter;
        this.service = service;
    }

    abstract void fetchData();

    AbstractInitiator setNextInitiation(AbstractInitiator nextInitiation) {
        this.nextInitiation = nextInitiation;

        return this;
    }

    void init(Level level) {
        if (this.level.getValue() <= level.getValue()) {
            fetchData();
        } else {
            nextInitiation.init(level);
        }
    }
}