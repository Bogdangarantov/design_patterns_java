package org.example.HW16.task16_3_3;

public class Main {
    public static void main(String[] args) {
        Box root = new Box("Головна коробка");
        Box tools = new Box("Інструменти");
        Box food = new Box("Продукти");

        tools.add(new Item("Викрутка", 120));
        tools.add(new Item("Молоток", 150));
        food.add(new Item("Хліб", 35));
        food.add(new Item("Сир", 95));

        root.add(tools);
        root.add(food);
        root.add(new Item("Фонарик", 200));

        System.out.println("Обхід в глибину (DFS):");
        DFSIterator dfs = new DFSIterator(root);
        while (dfs.hasNext()) {
            Component c = dfs.next();
            System.out.println(c);
        }

        System.out.println("\nОбхід в ширину (BFS):");
        BFSIterator bfs = new BFSIterator(root);
        while (bfs.hasNext()) {
            Component c = bfs.next();
            System.out.println(c);
        }

        DFSIterator search = new DFSIterator(root);
        Item min = null, max = null;
        while (search.hasNext()) {
            Component c = search.next();
            if (c instanceof Item item) {
                if (min == null || item.price() < min.price()) min = item;
                if (max == null || item.price() > max.price()) max = item;
            }
        }

        System.out.println("\nНайдешевший елемент: " + min);
        System.out.println("Найдорожчий елемент: " + max);
    }
}
