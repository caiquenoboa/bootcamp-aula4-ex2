package com.company;

public class Main {

    public static void main(String[] args) {
    exercicio3();
    }


//     Dado um vetor de 10 posições,
//     sendo respectivamente ocupado pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.]
//     Imprima no console:
//
//     a) Sua ordenação crescente.
//
//     b) Sua ordenação decrescente.
    public static void exercicio1(){
        Integer[]  array = { 52, 10, 85, 1324, 01, 13, 62, 30, 12, 127 };

        Integer[] arrayOrdered = bubbleSort(array);

        printArray(arrayOrdered);

        Integer[] arrayRevert = reverArray(arrayOrdered);

        printArray(arrayRevert);

    }

    public static Integer[] reverArray(Integer[] array){
        Integer[] arrayRevert = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            arrayRevert[i] = array[array.length - (i + 1)];
        }
        return arrayRevert;
    }

    public static Integer[] bubbleSort(Integer[] array){
        Integer[] arrayOrdered = array;

        Integer aux;

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length-1; j++){
                if(arrayOrdered[j] > arrayOrdered[j + 1]){
                    aux = arrayOrdered[j];
                    arrayOrdered[j] = arrayOrdered[j+1];
                    arrayOrdered[j+1] = aux;
                }
            }
        }
        return arrayOrdered;
    }

    public static void printArray(Integer[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(" "+array[i]);
        }
    }


    public static void exercicio2() {

        double value_x = 1.13;
        double crescimento_x = 1.48;

        double value_y = 18.4;
        double crescimento_y = 0.32;

        int year = 2021;

        do {
            printEmpresas(year, value_x, value_y);
            year++;
            value_x += value_x*crescimento_x;
            value_y += value_y*crescimento_y;

        }while(value_x < value_y);

        printEmpresas(year, value_x, value_y);

    }

    public static void printEmpresas(int year, double valor_x, double valor_y){
        System.out.println("Empresa X - 01/01/" + year + " - Valor da empresa: " + valor_x + "m");
        System.out.println("Empresa Y - 01/01/" + year + " - Valor da empresa: " + valor_y + "m");
    }

    public static void exercicio3(){
        Product produto1 = new Product(1, "Arroz", 10.99, 2);
        Product produto2 = new Product(2, "Feijão", 14.49, 1);
        Product produto3 = new Product(3, "Tomate", 9.99, 5);

        produto1.print();
        System.out.println();
        produto2.print();
        System.out.println();
        produto3.print();
    }


}

class Product{
    private int id;
    private String name;
    private double preco;
    private int quantidade;
    Product(int id, String name, double preco, int quantidade){
        this.id = id;
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void print(){
        System.out.println("Produto: " + id);
        System.out.println(name);
        System.out.println("R$:" + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}