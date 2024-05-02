package modelo;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBase;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;
    
    public void muestraFichaTecnica() {
        
        System.out.println("-FICHA TECNICA-");
        System.out.println("Nombre del Titulo: " + nombre); 
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento); 
        System.out.println("Tiempo de Duracion: " + getTiempoDeDuracionEnMinutos() + " minutos"); 
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    
    public double getEvaluacion() {
        return evaluacion;
    }

    public boolean isIncluidoEnElPlanBase() {
        return incluidoEnElPlanBase;
    }

    public void setIncluidoEnElPlanBase(boolean incluidoEnElPlanBase) {
        this.incluidoEnElPlanBase = incluidoEnElPlanBase;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }
}
