package org.bedu.java.jse.postworks5;


public class MainTaskList {
    public static void main(String[] args){

        Main main = new Main();
        Reader reader = new Reader();
        TaskList list = new TaskList();


        byte optionChosenByUser = 0;


        do {
            ClearConsole.clearConsole();
            main.ChoseOption();
            optionChosenByUser = reader.readOption();


            System.out.println("\n\nLa opción seleccionada es: " + optionChosenByUser);

            switch (optionChosenByUser) {
                case 1:
                    list.createNewList();
                    break;
                case 2:
                    list.viewTaskList();
                    break;
                case 3:
                    list.seeListTasks();
                    break;
                case 4:
                    list.updateToDoList();
                    break;
                case 5:
                    list.deleteTaskList();
                    break;
                case 6:
                    System.out.println("Cerrando sesión.");
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }

        }while(optionChosenByUser != 6);
    }
}
