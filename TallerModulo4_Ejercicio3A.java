// Java
int totalHP = 0;
for (Personaje p : gremio) {              
    if (p.getEstado().equals("activo")) {
        totalHP += p.getHp();             
    }
}
System.out.println("HP total activos: " + totalHP); 
