public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    ArrayList<paciente> listaPacientes = new ArrayList<paciente>();

    int opcion;

    do {
        System.out.println(" Menu ");
        System.out.println("1. Crear paciente");
        System.out.println("2. Buscar paciente");
        System.out.println("3. Modificar edad");
        System.out.println("4. Modificar peso");
        System.out.println("5. Modificar presion");
        System.out.println("6. Cambiar estado");
        System.out.println("7. Mostrar informacion");
        System.out.println("8 Salir");
        System.out.println("Opcion: ");

        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion){

            case 1:
                System.out.println("Nombre");
                String nombre = teclado.nextLine();

                System.out.println("Edad:");
                int edad = teclado.nextInt();

                System.out.println("Peso: ");
                double peso = teclado.nextDouble();

                System.out.println("Presion arterial: ");
                double presion = teclado.nextDouble();

                paciente nuevo = paciente ( nombre,edad , peso , presion ,  true);
                listaPacientes.add(nuevo);

                System.out.println("Paciente creado");
                break;

            case 2:
                System.out.println("Nombre del paciente");
                String buscar





        }

} while
