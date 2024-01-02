package dev.brunopatrick.compass.exercise6;

import dev.brunopatrick.compass.exercise6.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Program6 {
    public static void main(String[] args) {
        final Produto p1 = new Produto("TV", UUID.randomUUID(), 500.00, 100);
        final Produto p2 = new Produto("Notebook", UUID.randomUUID(), 1000.00, 49);

        final List<Produto> produtoList = new ArrayList<>();
        produtoList.add(p1);
        produtoList.add(p2);

        for (Produto p : produtoList) {
            System.out.println(p + "\n");
        }

        System.out.println("--------------------------");
        p1.comprar(25);
        p2.vender(20);
        System.out.println();

        for (Produto p : produtoList) {
            System.out.println(p + "\n");
        }

        System.out.println("--------------------------");
        p1.comprar(2);
        p2.vender(28);
        System.out.println();

        for (Produto p : produtoList) {
            System.out.println(p + "\n");
        }
    }
}
