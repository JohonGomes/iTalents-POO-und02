package Interfaces;
//aqui usamos implements
class Cachorro implements Animal{

    @Override
    public void fazerBarulho() {
        System.out.println("Cachorro fazendo barulho : Au au");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo ração...");
    }
}
