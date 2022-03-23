package com.detroitlabs.wilkswingshop.data;

import com.detroitlabs.wilkswingshop.model.Drink;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DrinkRepository {

    private static final List<Drink> DRINK_LIST = Arrays.asList(
            new Drink("Wine", "Red", 6),
            new Drink("Wine", "White", 6),
            new Drink("Beer", "Lager", 4),
            new Drink("Beer", "IPA", 5),
            new Drink("Beer", "")

    )
}
