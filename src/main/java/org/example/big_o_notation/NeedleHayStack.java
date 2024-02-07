package org.example.big_o_notation;

import java.util.Random;

public class NeedleHayStack {
    public static void main(String[] args) {
        String[] kitchenItems = {
                "Sofa", "Television", "Refrigerator", "Microwave", "Toaster",
                "Vacuum cleaner", "Washing machine", "Dishwasher", "Oven", "Coffee maker",
                "Couch", "Table", "Chair", "Bed", "Dresser",
                "Lamp", "Desk", "Bookshelf", "Mirror", "Rug",
                "Cutlery", "Dining table", "Kitchen utensils", "Blender", "Curtains",
                "Iron", "Hair dryer", "Shower curtain", "Towels", "Toilet paper",
                "Broom", "Mop", "Trash can", "Plunger", "Laundry basket",
                "Alarm clock", "Fan", "Heater", "Air purifier", "Humidifier"
        };

        String needle = kitchenItems [new Random().nextInt(0,40)];
        System.out.println(needle);

        System.out.println(findNeedle(needle, kitchenItems));
    }
    private static String findNeedle(String needle, String[] haystack){
        StringBuilder stringBuilder = new StringBuilder();
        for(int x = 0; x<haystack.length; x++){
            if (needle.equals(haystack[x]))
                stringBuilder.append(haystack[x]).append(" Found at index: ").append(x);
        }
        return stringBuilder.toString();
    }
}
