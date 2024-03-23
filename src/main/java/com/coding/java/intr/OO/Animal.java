package com.coding.java.intr.OO;

// Abstração: fornece uma representação simplificada de um conceito complexo
abstract class Animal {

    public abstract void fazerSom();

}
class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Cachorro late");
    }

    public class Main{
        public void main(String[] args) {
            //Encapsalumento
            Carro carro = new Carro("Nissan", "Kicks");
            System.out.println("Marca do Carro " + carro.getMarca());

            //Herança
            CarroTurbinado carroTurbinado = new CarroTurbinado(
                    "Gol Qaudrado", "Batedeira", true);

            // Polimorfismo
            Revendedora revendedora =  new Revendedora();
            revendedora.venderCarro(carro);
            revendedora.venderCarro(carroTurbinado);

            //Abstração
            Animal cachorro = new Cachorro();
            cachorro.fazerSom();
        }
    }


}