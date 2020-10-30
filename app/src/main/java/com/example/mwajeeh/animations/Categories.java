package com.example.mwajeeh.animations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Categories {
    private static List<Category> categories = generateItems();

    static List<Category> getCategories() {
        return categories;
    }

    private static List<Category> generateItems() {
        Random rand = new Random();
        List<Category> items = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            items.add(new Category("title:" + i, getImage(rand.nextInt(2))));
        }
        return items;
    }

    static class Category {
        final String title;
        final int image;

        private Category(String title, int image) {
            this.title = title;
            this.image = image;
        }
    }

    private static int getImage(int position) {
        switch (position) {
            case 0:
                return R.drawable.image_1;
            default:
                return R.drawable.image_2;
        }
    }
}
