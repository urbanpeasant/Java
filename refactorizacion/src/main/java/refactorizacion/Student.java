package refactorizacion;


//NOTA: Aquí no había mucha chicha. He intercambiado los nombres de las variables (studentName por simplemente name, por ej) para que se entienda mejor. El ejercicio estaba en inglés, entiendo que es de internet, así que lo he dejado en inglés para que no resltase engorroso.

public class Student {
    private int id;
    private String name;

    public Student(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public void updateName(String newName) {
        name = newName;
    }
}

