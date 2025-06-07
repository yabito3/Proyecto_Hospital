public class Main {
    public static void main(String[] args) {
        StackMedicamento pila = new StackMedicamento();

        pila.push(new Medicamento("Paracetamol", "500mg"));
        pila.push(new Medicamento("Ibuprofeno", "400mg"));
        pila.push(new Medicamento("Amoxicilina", "250mg"));

        System.out.println("Último medicamento agregado: " + pila.peek());

        System.out.println("\nRetirando medicamentos:");
        while (!pila.isEmpty()) {
            Medicamento med = pila.pop();
            System.out.println("- " + med);
        }
    }
}
