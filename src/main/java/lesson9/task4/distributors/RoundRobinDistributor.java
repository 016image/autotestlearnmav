package lesson9.task4.distributors;

import lesson9.task4.Cooker;

import java.util.List;

public class RoundRobinDistributor extends Distributor {

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxAmount = Integer.MAX_VALUE;
        Cooker candidate = null;
        for (Cooker cooker : cookers) {
            if (cooker.getOrderSize() < maxAmount) {
                maxAmount = cooker.getOrderSize();
                candidate = cooker;
            }
        }
        return candidate;
    }
}