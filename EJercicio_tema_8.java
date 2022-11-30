
/*
 * @author luis
 */
public class Bootcamp3 {
    public static void main(String[] args) {
        Persona persona =new Persona();
        //Aplicación de la clase persona
        //---------------------------------------------
        persona.setNombre("Luis");
        System.out.println("Nombre de la persona: "+persona.getNombre());
        
        persona.setEdad(20);
        System.out.println("edad "+ persona.getEdad()+" años");
        
        persona.setTelefono(321056534);
        System.out.println("Este es su numero de telefono: "+persona.getTelefono());
        //---------------------------------------------
    }
}
class Persona {
    
    /*
    Metodos Privados
    */
    private String nombre;
    private int edad;
    private int telefono;
    //-----------------
    
    /*
    Metodos Publicos
    */
    //Funciones Get y Set de la propiedad nombre
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    //Funciones Get y Set de la propiedad apellido
    public void setEdad(int apellido){
        this.edad=apellido;
    }
    public int getEdad(){
        return edad;
    }
    //Funciones Get y Set de la propiedad telefono
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
    
    //--------------------------------------------------------------------------
}
