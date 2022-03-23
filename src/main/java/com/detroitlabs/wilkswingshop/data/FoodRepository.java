package com.detroitlabs.wilkswingshop.data;

import com.detroitlabs.wilkswingshop.model.Food;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FoodRepository {

        private static final List<Food> FOOD_LIST = Arrays.asList(
                new Food("Appetizer", "Pickle Chips", 1, 7.99),
                new Food("Appetizer", "Nachos", 2,11.99),
                new Food("Appetizer", "Jalapeno Poppers", 4, 8.99),
                new Food("Appetizer", "Fries", 0, 3.99),
                new Food("Wings", "Buffalo", 3, 13.99),
                new Food("Wings", "Dry Rub", 1, 13.99),
                new Food("Wings", "Mild", 1, 12.99),
                new Food("Wings", "Garlic Parm", 1, 13.99),
                new Food("Wings", "Lemon Pepper", 2, 13.99),
                new Food("Wings", "Punch yo momma hot", 5, 13.99),
                new Food("Dessert", "Chocolate Chip Cookies", 0, 7.99)

        );
}
