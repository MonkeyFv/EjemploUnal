package co.com.conexion.business.service;
import co.com.conexion.model.dao.*;
import co.com.conexion.model.entity.*;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {
        bicicletaCrearLista();
        proovedorCrearLista();
        motocicletaElectricaCrearLista();
        clienteCrearLista();
        fabricanteCrearLista();
        intencionesCrearLista();

        //bicicletaCrear();
        //bicicletaListar();
        //bicicletaActualizar();
        //bicicletaEliminar();

        //proveedorCrear();
        //proveedorListar();
        //proveedorActualizar();
        //proveedorEliminar();

        //motocicletaElectricaCrear();
        //motocicletaElectricaListar();
        //motocicletaElectricaEliminar();
        //motocicletaElectricaActualizar();

        //clienteCrear();
        //clienteListar();
        //clienteActualizar();
        //clienteEliminar();

        //fabricanteCrear();
        //fabricanteListar();
        //fabricanteEliminar();

        //intencionesCrear();
        //intencionesListar();
        //intencionesActualizar();
        //intencionesEliminar();
    }
    public static void bicicletaCrearLista() throws SQLException {
        var main = new main(new BicicletaService(new BicicletaImpl()));
        main.bicicletaService.crearLista();
    }
    public static void bicicletaCrear() throws SQLException {
        var main = new main(new BicicletaService(new BicicletaImpl()));
        var bicicleta1 =new Bicicleta("cannolade","1200000", 2022);
        var bicicleta2 = new Bicicleta("Trek","1450000", 2019);
        var bicicleta3 = new Bicicleta("Yeti","2000000", 2020);
        var bicicleta4 = new Bicicleta("Fuji","950000", 2021);
        var bicicleta5 = new Bicicleta("Bmc","1950000", 1018);
        main.bicicletaService.crear(bicicleta1);
        main.bicicletaService.crear(bicicleta2);
        main.bicicletaService.crear(bicicleta3);
        main.bicicletaService.crear(bicicleta4);
        main.bicicletaService.crear(bicicleta5);

    }

    public static void bicicletaEliminar() throws SQLException{
        var main = new main(new BicicletaService(new BicicletaImpl()));
        String nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre que desea eliminar");
        nombre=scanner.nextLine();
        main.bicicletaService.eliminar(nombre);
    }
    public static void bicicletaActualizar() throws SQLException {
        var main = new main(new BicicletaService(new BicicletaImpl()));
        Scanner scanner = new Scanner(System.in);
        String nombre,precio;
        int anio;
        System.out.println("Ingrese nombre");
        nombre=scanner.nextLine();
        System.out.println("Ingrese nuevo precio");
        precio=scanner.nextLine();
        System.out.println("Ingrese nuevo año");
        anio=scanner.nextInt();
        var bicicleta =new Bicicleta(nombre,precio,anio);
        main.bicicletaService.actualizar(bicicleta);
    }
    public static void bicicletaListar() throws SQLException {
        var main = new main(new BicicletaService(new BicicletaImpl()));
        System.out.println(main.bicicletaService.listar());
    }
    public static void motocicletaElectricaCrearLista() throws SQLException{
        var main = new main(new MotocicletaElectricaService(new MotocicletaElectricaImpl()));
        main.motocicletaElectricaService.crearLista();
    }
    public static void motocicletaElectricaCrear()throws SQLException{
        var main = new main(new MotocicletaElectricaService(new MotocicletaElectricaImpl()));
        var motocicletaElectrica1 = new MotocicletaElectrica("Starker","4200000","18 horas","Auteco");
        var motocicletaElectrica2 = new MotocicletaElectrica("Lucky Lion","5600000","14 horas","Hitachi");
        var motocicletaElectrica3 = new MotocicletaElectrica("Be Electric","4600000","26 horas","Auteco");
        var motocicletaElectrica4 = new MotocicletaElectrica("Aima","8000000","36 horas","Bosch");
        var motocicletaElectrica5 = new MotocicletaElectrica("Starker","333","18 horas","Auteco");
        var motocicletaElectrica6 = new MotocicletaElectrica("Mec de Colombia","5900000","20 horas","eco");
        main.motocicletaElectricaService.crear(motocicletaElectrica1);
        main.motocicletaElectricaService.crear(motocicletaElectrica2);
        main.motocicletaElectricaService.crear(motocicletaElectrica3);
        main.motocicletaElectricaService.crear(motocicletaElectrica4);
        main.motocicletaElectricaService.crear(motocicletaElectrica5);
        main.motocicletaElectricaService.crear(motocicletaElectrica6);
    }
    public static void motocicletaElectricaEliminar() throws SQLException{
        var main = new main(new MotocicletaElectricaService(new MotocicletaElectricaImpl()));
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre que desea eliminar");
        nombre = scanner.nextLine();
        main.motocicletaElectricaService.eliminar(nombre);
    }
    public static void motocicletaElectricaActualizar() throws SQLException {
        var main = new main(new MotocicletaElectricaService(new MotocicletaElectricaImpl()));
        Scanner scanner = new Scanner(System.in);
        String nombre,precio,autonomia,proovedor;
        System.out.println("Ingrese nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese nuevo precio");
        precio = scanner.nextLine();
        System.out.println("Ingrese nueva autonomia");
        autonomia = scanner.nextLine();
        System.out.println("Ingrese nuevo proovedor");
        proovedor = scanner.nextLine();
        var motocicletaElectrica =new MotocicletaElectrica(nombre,precio,autonomia,proovedor);
        main.motocicletaElectricaService.actualizar(motocicletaElectrica);
    }
    public static void motocicletaElectricaListar() throws SQLException {
        var main = new main(new MotocicletaElectricaService(new MotocicletaElectricaImpl()));
         System.out.println(main.motocicletaElectricaService.listar());
    }
    public static void clienteCrearLista() throws SQLException {
        var main = new main(new ClienteService(new ClienteImpl()));
        main.clienteService.crearLista();
    }
    public static void clienteCrear() throws SQLException{
        var main = new main(new ClienteService(new ClienteImpl()));
        var cliente1 =new Cliente("lucky","Pedro","Perez","3114322287");
        var cliente2 =new Cliente("malopez","Maria","Lopez","3114322287");
        var cliente3 =new Cliente("diva","Maria","Lopez","3114322287");
        var cliente4 =new Cliente("dreamer","Luis","Rojas","3114322287");
        var cliente5 =new Cliente("ninja","Andres","Cruz","3114322287");
        var cliente6 =new Cliente("neon","Nelson","Ruiz","3114322287");
        var cliente7 =new Cliente("rose","Claudia","Mendez","3114322287");
        var cliente8 =new Cliente("green","Jorge","Rodriguez","3114322287");
        main.clienteService.crear(cliente1);
        main.clienteService.crear(cliente2);
        main.clienteService.crear(cliente3);
        main.clienteService.crear(cliente4);
        main.clienteService.crear(cliente5);
        main.clienteService.crear(cliente6);
        main.clienteService.crear(cliente7);
        main.clienteService.crear(cliente8);
    }
    public static void clienteEliminar() throws SQLException{
        var main = new main(new ClienteService(new ClienteImpl()));
        String nombre;
        System.out.println("Ingrese alias que desea eliminar");
        Scanner scanner = new Scanner(System.in);
        nombre=scanner.nextLine();main.clienteService.eliminar(nombre);
    }
    public static void clienteActualizar() throws SQLException {
        var main = new main(new ClienteService(new ClienteImpl()));
        Scanner scanner = new Scanner(System.in);
        String alias,nombre,apellido,telefono;
        System.out.println("Ingrese alias");
        alias=scanner.nextLine();
        System.out.println("Ingrese nuevo nombre");
        nombre=scanner.nextLine();
        System.out.println("Ingrese nuevo apellido");
        apellido=scanner.nextLine();
        System.out.println("Ingrese nuevo telefono");
        telefono=scanner.nextLine();
        var cliente =new Cliente(alias,nombre,apellido,telefono);
        main.clienteService.actualizar(cliente);
    }
    public static void clienteListar() throws SQLException {
        var main = new main(new ClienteService(new ClienteImpl()));
        System.out.println(main.clienteService.listar());
    }
    public static void fabricanteCrearLista() throws SQLException {
        var main = new main(new FabricanteService(new FabricanteImpl()));
        main.fabricanteService.crearLista();
    }
    public static void fabricanteCrear() throws SQLException{
        var main = new main(new FabricanteService(new FabricanteImpl()));
        var cliente1 = new Fabricante("Starker");
        var cliente2= new Fabricante("Lucky Lion");
        var cliente3 = new Fabricante("Aima");
        var cliente4 = new Fabricante("Mec de Colombia");
        var cliente5 = new Fabricante("Atom Electric");
        var cliente6 = new Fabricante("Cannondale");
        var cliente7 = new Fabricante("Trek");
        var cliente8 = new Fabricante("Yeti");
        var cliente9 = new Fabricante("Fuji");
        var cliente10 = new Fabricante("Bmc");
        var cliente11 = new Fabricante("Be Electric");
        main.fabricanteService.crear(cliente1);
        main.fabricanteService.crear(cliente2);
        main.fabricanteService.crear(cliente3);
        main.fabricanteService.crear(cliente4);
        main.fabricanteService.crear(cliente5);
        main.fabricanteService.crear(cliente6);
        main.fabricanteService.crear(cliente7);
        main.fabricanteService.crear(cliente8);
        main.fabricanteService.crear(cliente9);
        main.fabricanteService.crear(cliente10);
        main.fabricanteService.crear(cliente11);
    }
    public static void fabricanteEliminar() throws SQLException{
        var main = new main(new FabricanteService(new FabricanteImpl()));
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre que desea eliminar");
        nombre = scanner.nextLine();
        main.fabricanteService.eliminar(nombre);
    }

    public static void fabricanteListar() throws SQLException {
        var main = new main(new FabricanteService(new FabricanteImpl()));
        System.out.println(main.fabricanteService.listar());
    }
    public static void intencionesCrearLista() throws SQLException {
        var main = new main(new IntencionesService(new IntecionesImpl()));
        main.intencionesService.crearLista();
    }
    public static void intencionesCrear() throws SQLException{
        var main = new main(new IntencionesService(new IntecionesImpl()));
        var intenciones1 = new Intenciones("lucky","Cannondale","2017-10-25 20:00:00");
        var intenciones2 = new Intenciones("lucky","Trek","2019-03-15 18:30:00");
        var intenciones3 = new Intenciones("lucky","Starker","2019-05-20 20:30:00");
        var intenciones4 = new Intenciones("malopez","Cannondale","2018-05-20 20:30:00");
        var intenciones5 = new Intenciones("malopez","Starker","2020-01-20 20:30:00");
        var intenciones6 = new Intenciones("diva","Yeti","2019-05-20 20:30:00");
        var intenciones7 = new Intenciones("diva","Fuji","2018-06-22 21:30:00");
        var intenciones8 = new Intenciones("diva","Lucky Lion","2020-03-17 15:30:20");
        var intenciones9 = new Intenciones("dreamer","Lucky Lion","2020-03-17 15:30:20");
        var intenciones10 = new Intenciones("dreamer","Be Electric","2020-04-10 18:30:20");
        var intenciones11 = new Intenciones("ninja","Aima","2020-02-17 20:30:20");
        var intenciones12 = new Intenciones("ninja","Starker","2020-02-20 16:30:20");
        var intenciones13 = new Intenciones("ninja","Mec de Colombia","2020-03-27 18:30:20");
        var intenciones14 = new Intenciones("rose","Atom Electric","2020-03-20 21:30:20");
        var intenciones15 = new Intenciones("green","Yeti","2020-01-10 17:30:20");
        var intenciones16 = new Intenciones("green","Trek","2020-02-15 20:30:20");
        var intenciones17 = new Intenciones("green","Bmc","2020-03-17 18:30:20");
        main.intencionesService.crear(intenciones1);
        main.intencionesService.crear(intenciones2);
        main.intencionesService.crear(intenciones3);
        main.intencionesService.crear(intenciones4);
        main.intencionesService.crear(intenciones5);
        main.intencionesService.crear(intenciones6);
        main.intencionesService.crear(intenciones7);
        main.intencionesService.crear(intenciones8);
        main.intencionesService.crear(intenciones9);
        main.intencionesService.crear(intenciones10);
        main.intencionesService.crear(intenciones11);
        main.intencionesService.crear(intenciones12);
        main.intencionesService.crear(intenciones13);
        main.intencionesService.crear(intenciones14);
        main.intencionesService.crear(intenciones15);
        main.intencionesService.crear(intenciones16);
        main.intencionesService.crear(intenciones17);

    }
    public static void intencionesEliminar() throws SQLException{
        var main = new main(new IntencionesService(new IntecionesImpl()));
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese nombre que desea eliminar");
        nombre = scanner.nextLine();
        main.intencionesService.eliminar(nombre);
    }
    public static void intencionesActualizar() throws SQLException {
        var main = new main(new IntencionesService(new IntecionesImpl()));
        Scanner scanner = new Scanner(System.in);
        String alias,marca,hora;
        System.out.println("Ingrese alias");
        alias = scanner.nextLine();
        System.out.println("Ingrese nueva marca");
        marca = scanner.nextLine();
        System.out.println("Ingrese nueva hora");
        hora = scanner.nextLine();
        var intenciones =new Intenciones(alias,marca,hora);
        main.intencionesService.actualizar(intenciones);
    }
    public static void intencionesListar() throws SQLException {
        var main = new main(new IntencionesService(new IntecionesImpl()));
        System.out.println(main.intencionesService.listar());
    }
    public static void proovedorCrearLista() throws SQLException {
        var main = new main(new ProveedorService(new ProvedorImpl()));
        main.proveedorService.crearLista();
    }
    public static void proveedorCrear() throws SQLException{
        var main = new main (new ProveedorService(new ProvedorImpl()));
        var proveedor1 = new Proveedor("Auteco","calle 7 No. 45-17","3144020582");
        var proveedor2 = new Proveedor("Hitachi","calle 19 No. 108-26","3144020583");
        var proveedor3 = new Proveedor("Bosch","carrera 68 No. 26-45","3144020584");
        var proveedor4 = new Proveedor("Teco","calle 77 No. 68-33","3144020585");
        var proveedor5 = new Proveedor("General Electric","calle 29 No. 26-12","3144020586");
        main.proveedorService.crear(proveedor1);
        main.proveedorService.crear(proveedor2);
        main.proveedorService.crear(proveedor3);
        main.proveedorService.crear(proveedor4);
        main.proveedorService.crear(proveedor5);
    }
    public static void proveedorEliminar() throws SQLException{
        var main = new main(new ProveedorService(new ProvedorImpl()));
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese nombre que desea eliminar");
        nombre = scanner.nextLine();
        main.proveedorService.eliminar(nombre);
    }
    public static void proveedorActualizar() throws SQLException {
        var main = new main(new ProveedorService(new ProvedorImpl()));
        Scanner scanner = new Scanner(System.in);
        String nombre,direccion,telefono;
        System.out.println("Ingrese nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese nueva direccion");
        direccion = scanner.nextLine();
        System.out.println("Ingrese nuevo telefono");
        telefono = scanner.nextLine();
        var proveedor =new Proveedor(nombre,direccion,telefono);
        main.proveedorService.actualizar(proveedor);
    }
    public static void proveedorListar() throws SQLException {
        var main = new main(new ProveedorService(new ProvedorImpl()));
        System.out.println(main.proveedorService.listar());
    }
    private BicicletaService bicicletaService;
    private MotocicletaElectricaService motocicletaElectricaService;
    private ClienteService clienteService;
    private FabricanteService fabricanteService;

    private IntencionesService intencionesService;
    private ProveedorService proveedorService;

    public main(ProveedorService proveedorService) {this.proveedorService = proveedorService;}

    public main(IntencionesService intencionesService) {this.intencionesService = intencionesService;}

    public main(FabricanteService fabricanteService) {this.fabricanteService = fabricanteService;}

    public main(ClienteService clienteService) {this.clienteService = clienteService;}

    public main(BicicletaService bicicletaService) {this.bicicletaService = bicicletaService;}

    public main(MotocicletaElectricaService motocicletaElectricaService) {this.motocicletaElectricaService = motocicletaElectricaService;}

}