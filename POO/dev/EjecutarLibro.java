public class EjecutarLibro {
    public static void main(String[] args) {

        //Creacion de 5 libros
        Libro objLibro1 = new Libro("196-613", "Matematicas I", "Roger", 1950, true); 
        Libro objLibro2 = new Libro("233-547", "Fisisca I", "Roger", 1985, true); 
        Libro objLibro3 = new Libro("325-689", "Ingles I", "Roger", 1957, true); 
        Libro objLibro4 = new Libro("485-522", "POO I", "Roger", 1999, true); 
        Libro objLibro5 = new Libro("587-441", "Software II", "Roger", 1979, true);
        
        //Mostrar la informacion de los libros

        System.out.println(objLibro1);
        System.out.println(objLibro2);
        System.out.println(objLibro3);
        System.out.println(objLibro4);
        System.out.println(objLibro5);

        //Mostrar solo el titulo del libro 2 
        System.out.println(objLibro2.getTitulo());

        //Cambiar el isbn del libro 5 
        objLibro5.setIsbn("0000-00");
        System.out.println(objLibro5);

        
        
        //Prestar el libro 3 
        objLibro3.prestar();
        //Verificar si el libro3 esta disponible 
        System.out.println(objLibro3.estaDisponible()); // false
        //Devolver el libro 3 
        objLibro3.devolver();
        //Verificar si el libro3 esta disponible despues 
        System.out.println(objLibro3.estaDisponible()); // true
    }
}
