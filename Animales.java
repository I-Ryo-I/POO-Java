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

class Vaca extends Animales{
    public void sonido(){
        System.out.println("La vaca hace muu");
    }
    public void Casa(){
        System.out.println("La vaca vive en el establo");
    }
    public void Color(){
        System.out.println("La vaca es blanca con manchas negras");
    }
}

class Leon extends Animales{
    public void sonido(){
        System.out.println("El leon hace roar");
    }
    public void Casa(){
        System.out.println("El leon vive en la selva");
    }
    public void Color(){
        System.out.println("El leon es cafe");
    }
}

class Pollito extends Animales{
    public void sonido(){
        System.out.println("El pollito hace pio");
    }
    public void Casa(){
        System.out.println("El pollito vive en la granja");
    }
    public void Color(){
        System.out.println("El pollito es amarillo");
    }
}
