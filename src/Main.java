import accidentes.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    //todo menu y las consultas
    static void lanzarMenu(){
        System.out.println("------Ingrese la opción--------");
        System.out.println("1. Ingresar Marca");
        System.out.println("2. Ingresar carro");
        System.out.println("3. Ingresar Dueño");
        System.out.println("4. Ingresar comentario");
        System.out.println("5. Marca más vendida");
        System.out.println("6. Marca con más incidentes");
        System.out.println("7. País más comúm y cantidad carros");
        System.out.println("8. Incidentes de cada dueño");
        System.out.println("9.Salir");
    }
    public static void main(String[] args) {


        Marca marca1 = new Marca(1L, "Hyundai", "Canada");
        Marca marca2 = new Marca(2L, "Toyota", "Japon");
        Marca marca3 = new Marca(3L, "Ford", "Alemania");
        Marca marca4 = new Marca(4L, "BMW", "Alemania");
        Marca marca5 = new Marca(5L, "Renault", "Francia");
        Marca marca6 = new Marca(6L, "Fiat", "Alemania");

        Carro carro1 = new Carro("ABC111", "2", 2010);
        Carro carro2 = new Carro("ABC222", "5", 2005);
        Carro carro3 = new Carro("ABC333", "4", 2013);
        Carro carro4 = new Carro("ABC444", "6", 2022);
        Carro carro5 = new Carro("ABC555", "8", 2014);
        Carro carro6 = new Carro("ABC666", "3", 2024);
        Carro carro7 = new Carro("ABC777", "1", 2017);
        Carro carro8 = new Carro("ABC888", "2", 2002);
        Carro carro9 = new Carro("ABC999", "4", 2019);
        Carro carro10 = new Carro("ABC1010", "5", 2025);

        Dueno dueno1 = new Dueno(1L, "Juan", "Perez", "3105328943");//Carros: 1 3 10
        Dueno dueno2 = new Dueno(2L, "Pedro", "Giraldo", "3508113285");//Carros: 1 5
        Dueno dueno3 = new Dueno(3L, "Carlos", "Ramirez", "3117654321");//Carros: 2 6
        Dueno dueno4 = new Dueno(4L, "Luisa", "Fernandez", "3209876543");//Carros: 3 8
        Dueno dueno5 = new Dueno(5L, "Andres", "Martinez", "3012345678");//Carros: 4 8
        Dueno dueno6 = new Dueno(6L, "Sofia", "Lopez", "3156789012");//Carros: 5 9
        Dueno dueno7 = new Dueno(7L, "Diego", "Torres", "3123456789");//Carros: 6 9
        Dueno dueno8 = new Dueno(8L, "Laura", "Rojas", "3184567890");//Carros: 7 10

        carro1.setMarca(marca3);
        carro2.setMarca(marca1);
        carro3.setMarca(marca5);//
        carro4.setMarca(marca2);
        carro5.setMarca(marca1);
        carro6.setMarca(marca6);
        carro7.setMarca(marca4);
        carro8.setMarca(marca3);
        carro9.setMarca(marca5);//
        carro10.setMarca(marca5);//

        carro1.vincularDueno(dueno1);
        carro1.vincularDueno(dueno2);

        carro2.vincularDueno(dueno3);

        carro3.vincularDueno(dueno1);
        carro3.vincularDueno(dueno4);

        carro4.vincularDueno(dueno5);

        carro5.vincularDueno(dueno2);
        carro5.vincularDueno(dueno6);

        carro6.vincularDueno(dueno7);
        carro6.vincularDueno(dueno3);

        carro7.vincularDueno(dueno8);

        carro8.vincularDueno(dueno4);
        carro8.vincularDueno(dueno5);

        carro9.vincularDueno(dueno6);
        carro9.vincularDueno(dueno7);

        carro10.vincularDueno(dueno8);
        carro10.vincularDueno(dueno1);


        ArrayList<Dueno> duenos = new ArrayList<>();
        ArrayList<Comentario> comentarios = new ArrayList<>();
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Incidente> incidentes = new ArrayList<>();
        ArrayList<Marca> marcas = new ArrayList<>();

        // Agregar dueños
        duenos.add(dueno1);
        duenos.add(dueno2);
        duenos.add(dueno3);
        duenos.add(dueno4);
        duenos.add(dueno5);
        duenos.add(dueno6);
        duenos.add(dueno7);
        duenos.add(dueno8);

        // Agregar marcas
        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);
        marcas.add(marca4);
        marcas.add(marca5);
        marcas.add(marca6);

// Agregar carros
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        carros.add(carro6);
        carros.add(carro7);
        carros.add(carro8);
        carros.add(carro9);
        carros.add(carro10);

        Incidente incidente1 = new Incidente(1L, "choque", new Date(), "30448329384");
        Incidente incidente2 = new Incidente(2L, "robo", new Date(), "3101234567");
        Incidente incidente3 = new Incidente(3L, "vandalismo", new Date(), "3159876543");
        /*
        Incidente incidente4 = new Incidente(4L, "accidente", new Date(), "3204567890");
        Incidente incidente5 = new Incidente(5L, "choque", new Date(), "3112345678");
        Incidente incidente6 = new Incidente(6L, "robo", new Date(), "3187654321");
        Incidente incidente7 = new Incidente(7L, "vandalismo", new Date(), "3123456789");
        Incidente incidente8 = new Incidente(8L, "accidente", new Date(), "3165432109");
        Incidente incidente9 = new Incidente(9L, "choque", new Date(), "3109876543");
        Incidente incidente10 = new Incidente(10L, "robo", new Date(), "3198765432");

         */

        dueno3.agregarIncidente(incidente1);
        dueno3.agregarIncidente(incidente2);
        dueno4.agregarIncidente(incidente3);
        dueno5.agregarIncidente(incidente1);
        dueno7.agregarIncidente(incidente2);




        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("\n=============Bienvenido al sistema de carros==============\n");

        boolean salir = false;
        while(!salir){
            lanzarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el id de la marca: ");
                    long id = Long.parseLong(sc.nextLine()); // Consumir salto de línea pendiente

                    System.out.print("Ingrese el nombre de la marca: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese el país de la marca: ");
                    String pais = sc.nextLine();

                    Marca marca = new Marca(id, nombre, pais);

                    break;

                case 2:
                    System.out.print("Ingrese la placa del carro: ");
                    String placa = sc.nextLine();

                    System.out.print("Ingrese el modelo del carro: ");
                    String modelo = sc.nextLine();

                    System.out.print("Ingrese el año de lanzamiento del carro: ");
                    int anio = sc.nextInt();

                    Carro carro = new Carro(placa, modelo, anio);

                    System.out.println("Ingrese el id de la marca del carro: ");
                    long idMarca = Long.parseLong(sc.nextLine());

                    for(int i=0; i<marcas.size(); i++){
                        if(marcas.get(i).getId() == idMarca){
                            carro.setMarca(marcas.get(i));
                        }
                    }

                    break;
                case 3:
                    System.out.print("Ingrese la cédula del dueño: ");
                    long cedula = sc.nextLong();
                    sc.nextLine(); // Limpiar buffer

                    System.out.print("Ingrese el nombre del dueño: ");
                    String nombreDueno = sc.nextLine();

                    System.out.print("Ingrese el apellido del dueño: ");
                    String apellido = sc.nextLine();

                    System.out.print("Ingrese el teléfono del dueño: ");
                    String telefono = sc.nextLine();

                    Dueno dueno = new Dueno(cedula, nombreDueno, apellido, telefono);

                    break;
                case 4:
                    System.out.println("Nuevo comentario\nIngresa la placa del carro:");
                    String p = sc.nextLine();
                    int find=0;
                    for(int i = 0; i < carros.size(); i++){
                        if(carros.get(i).getPlaca().equals(p)){
                            System.out.println("Ingrese su comentario");
                            String coment = sc.nextLine();
                            Date fecha = new Date();
                            carros.get(i).agregarComentario(coment, fecha);
                            find++;
                        }
                    }
                    if(find==0){
                        System.out.println("No existe un carro con esa placa");
                    }


                    break;

                case 5:
                    int max=0;
                    Marca marcaMax=null;
                    for(int i = 0; i < marcas.size(); i++){
                        for(int j = 0; j < marcas.get(i).getCarros().size(); j++){
                            if(marcas.get(i).getCarros().get(j).getDuenos().size()>max){
                                marcaMax=marcas.get(i);
                                max=marcas.get(i).getCarros().get(j).getDuenos().size();
                                //cantidad de dueños de cada carro = cantidad compradores
                            }
                        }
                    }
                    System.out.println("Marca más vendida: "+marcaMax.getNombre());

                    break;

                case 6:
                    max=0;
                    marcaMax=null;
                    for(int i = 0; i < marcas.size(); i++){
                        for(int j = 0; j < marcas.get(i).getCarros().size(); j++){
                            for(int n=0; n < marcas.get(i).getCarros().get(j).getDuenos().size(); n++){
                                if(marcas.get(i).getCarros().get(j).getDuenos().get(n).getIncidentes().size()>max){
                                    marca=marcas.get(i);
                                    max=marcas.get(i).getCarros().get(j).getDuenos().get(n).getIncidentes().size();
                                    //busca dentro de cada dueño, incidente está conectado con dueño
                                }
                            }
                        }
                    }
                    System.out.println("Marca con más incidentes: "+marcaMax.getNombre());

                    break;

                case 7:
                    ArrayList<String> paises=new ArrayList<>();
                    for(int i = 0; i < marcas.size(); i++){
                        if(!paises.contains(marcas.get(i).getPais())){
                            paises.add(marcas.get(i).getPais());//por si varias marcas tienen un mismo pais
                        }
                    }

                    max=0;
                    String paisMax = null;
                    for(int t = 0; t < paises.size(); t++){
                        int save=0;
                        for(int i = 0; i < marcas.size(); i++){
                            if(marcas.get(i).getPais().equals(paises.get(t))){
                                save+=marcas.get(i).getCarros().size();
                            }
                        }
                        if(save>max){
                            max=save;
                            paisMax=paises.get(t);
                        }
                    }
                    System.out.println("Pais con más carros: "+paisMax+"\nCantidad: "+max);
                    break;

                case 8:
                    for(int i = 0; i < duenos.size(); i++){
                        System.out.println(duenos.get(i).getNombre()+"\n"+duenos.get(i).mostrarIncidentes());
                    }
                    break;

                case 9:

                    break;

                default:
                    System.out.println("Opción no valida");
                    break;

            }
            System.out.println("Digite cualquier numero para continuar: ");
            String n = sc.nextLine();
        }
    }
}