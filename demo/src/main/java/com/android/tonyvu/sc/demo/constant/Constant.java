package com.android.tonyvu.sc.demo.constant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.android.tonyvu.sc.demo.model.Product;

public final class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Megaminx 12 side", BigDecimal.valueOf(19.996), "Megaminx Black Puzzle Cube Designed for speed solving An excellent quality puzzle Mix it up and solve it when each side matches", "megaminx");
    public static final Product PRODUCT2 = new Product(2, "Rubik 3*3", BigDecimal.valueOf(12.9947), "The Rubik's Cube continues to challenge young and old alike. While it has 43 quintillion possible moves, it can be solved in incredibly few moves", "rubik_cube33");
    public static final Product PRODUCT3 = new Product(3, "Triangular cube", BigDecimal.valueOf(15.998140), "Tiny steel ball for positioning, it guarantees every rotation in place. ABS material, environmental protection and durable. PVC glossy stickers, no color fading.", "triangular_rubik");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
    }

    public static final String CURRENCY = "$";
}
