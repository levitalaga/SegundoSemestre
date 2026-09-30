public class Libro {
    // Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponibles;

    // Constructor
    public Libro(String isbn, String titulo, String autor, int anioPublicacion, boolean disponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponibles = disponibles;
    }
    // Getter y setter
    public String getIsbn(){
        return isbn;
    } 

    public void setIsbn(String isbn){
        this.isbn = isbn;

    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getautor(){
        return autor;
    }

    public void setautor(String autor){
        this.autor = autor;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    public boolean getDisponibles(){
        return disponibles;
    }

    public void setDisponibles(boolean disponibles){
        this.disponibles = disponibles;
    }

    public void prestar (){
        disponibles = false;
        }
        public void devolver (){
            disponibles = true;
        }
    
        public boolean estaDisponible(){
            return disponibles;
        }

        public String toString(){
            return "Libro[ isbn: " + isbn + " titulo: " + titulo + " autor: " + autor + 
            " anioPublicacion: " + anioPublicacion + " disponibles: " +  disponibles + " ]";
        }
}
