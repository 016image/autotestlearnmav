package lesson9.task4.distributors;

import java.util.List;

import lesson9.task4.Cooker;

public interface CookChooser {
    Cooker chooseCooker(List<Cooker> cookers);

}