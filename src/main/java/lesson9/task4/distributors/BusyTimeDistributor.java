package lesson9.task4.distributors;

import lesson9.task4.Cooker;

import java.util.List;

public class BusyTimeDistributor extends Distributor {
    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxTime = Integer.MAX_VALUE;

        Cooker candidate = null;
        for (Cooker currentCooker : cookers
        ) {
            if (currentCooker.getSummCookingTime() < maxTime) {
                maxTime = currentCooker.getSummCookingTime();
                candidate = currentCooker;
            }
        }
        return candidate;
    }
}
