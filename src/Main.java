public class Main {
    public static void main(String[] args) {

        Cliente newCliente = new Cliente();
        newCliente.setEdad(18);
        System.out.println(newCliente.getEdad());
        newCliente.setNombre("diego");
        System.out.println(newCliente.getNombre());
        newCliente.setTelefono(953120536);
        System.out.println(newCliente.getTelefono());
        newCliente.setCredito(120);
        System.out.println("$" +newCliente.getCredito());

        Trabajador newTrabajador = new Trabajador();
        newTrabajador.setSalario(1500);
        System.out.println("$"+newTrabajador.getSalario());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito){

        this.credito =  credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;
    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return this.salario;
    }
}
