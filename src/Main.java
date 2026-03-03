public static void main(String[] args) {
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

        switch (opcion) {

            case 1:
                System.out.println("Nombre");
                String nombre = teclado.nextLine();

                System.out.println("Edad:");
                int edad = teclado.nextInt();

                System.out.println("Peso: ");
                double peso = teclado.nextDouble();

                System.out.println("Presion arterial: ");
                double presion = teclado.nextDouble();

                paciente nuevo = new paciente(nombre, edad, peso, presion, true);
                listaPacientes.add(nuevo);

                System.out.println("Paciente creado");
                break;

            case 2:
                System.out.println("Nombre del paciente");
                String buscar = teclado.nextLine();

                for (paciente p : listaPacientes) {
                        if (p.getNombre().equalsIgnoreCase(buscar)){
                        p.mostrarHistoriaClinica();
                    }
                }
                break;
            case 3:
                System.out.println("Nombre del paciente");
                String nombreEdad = teclado.nextLine();

                for (paciente p : listaPacientes) {
                    if (p.getNombre().equalsIgnoreCase(nombreEdad)) {
                        p.cumplirAnios();
                        p.mostrarHistoriaClinica();
                    }
                }
                break;
            case 4:
                System.out.print("Nombre del psaciente");
                String nombrePeso = teclado.nextLine();

                for (paciente p : listaPacientes) {
                    if (p.getNombre().equalsIgnoreCase(nombrePeso)) {

                        System.out.println("1. Aumentar peso");
                        System.out.println("2. Disminuir peso");
                        int oqPeso = teclado.nextInt();

                        System.out.print("Cantidad: ");
                        double cantidad = teclado.nextDouble();

                        if (oqPeso == 1) {
                            p.aumentarPeso(cantidad);
                        } else {
                            p.disminuirPeso(cantidad);
                        }
                        p.mostrarHistoriaClinica();
                    }
                }
                break;
            case 5:
                System.out.print("Nombre del paciente: ");
                String nombrePresion = teclado.nextLine();

                for (paciente p : listaPacientes) {

                    if (p.getNombre().equalsIgnoreCase(nombrePresion)) {

                        System.out.println("1. Subir pression");
                        System.out.println("2. Bajar presion");
                        int opPresion = teclado.nextInt();

                        System.out.print("Valor: ");
                        double valor = teclado.nextDouble();

                        if (opPresion == 1) {
                            p.subirPresion(valor);

                        } else {
                            p.bajarPresion(valor);
                        }
                        p.mostrarHistoriaClinica();

                    }
                }
                break;
            case 6:

                System.out.print("Nombre del paciente ");
                String nombreEstado = teclado.nextLine();

                for (paciente p : listaPacientes) {

                    System.out.println("1. Mejorar estado");
                    System.out.println("Empeorar estado");
                    int opEstado = teclado.nextInt();

                    if (opEstado == 1) {
                        p.empeorarEstado();
                    }
                    p.mostrarHistoriaClinica();
                }
                break;
            case 7:
                for (paciente p : listaPacientes) {
                    p.mostrarHistoriaClinica();
                }
                break;
            case 8:
                System.out.println("Opcion invalida");
        }

    } while (opcion != 8);
    teclado.close();
}