public class Empresa {
    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;
    private boolean vivo;

    public Empresa() {

    }

    public Empresa(String nombre, int nivel, int experiencia, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vida=" + vida +
                ", vivo=" + vivo +
                '}';
    }

    //Aumenta experiencia en una cantidad (ej.10 puntos)
    public int ganarExperiencia( int cantidad){
       return experiencia += cantidad;
    }

    //Aumenta el nivel en 1 y reinicia experiencia de 0
    public int subirNivel (){
      experiencia = 0;
       return nivel++;
    }

    //Reduce la vida en cantidad
    public int recibirDanio (int cantidad){

        if (vida <=0){
            vida = 0;
            vivo = false;

        }
        return  vida -= cantidad;
    }
    //Aumenta la vida en una cantidad

    public int curarse (int cantidad){
        return  vida += cantidad;

    }

    //MOSTRAR INFORMACIO
    public void mostrarEstado(){
        System.out.println("nombre:" + this.getNombre());
        System.out.println("nivel:" + this.getNivel());
        System.out.println("experiencia:" + this.getExperiencia());
        System.out.println("vida:" + this.getVida());
    }



}
