class Animales{
    public void sonido(){
        System.out.println("El animal hace un sonido");
    }
    public void Casa(){
        System.out.println("El animal tiene un hogar");
    }
    public void Color(){
        System.out.println("El animal tiene un color");
    }
}

class Perro extends Animales{
    public void sonido(){
        System.out.println("El perro hace guau guau");
    }
    public void Casa(){
        System.out.println("El perro vive en la casa");
    }
    public void Color(){
        System.out.println("El perro es cafe");
    }
}

class Gato extends Animales{
    public void sonido(){
        System.out.println("El gato hace miau");
    }
    public void Casa(){
        System.out.println("El gato vive en la casa");
    }
    public void Color(){
        System.out.println("El gato es negro");
    }
}
}
