package Basictask;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {
	private static ArrayList<String> tasks = new ArrayList<>();

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println("\nTask List Menu:");
	            System.out.println("1. Add Task");
	            System.out.println("2. Remove Task");
	            System.out.println("3. List Tasks");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character

	            switch (choice) {
	                case 1:
	                    addTask(scanner);
	                    break;
	                case 2:
	                    removeTask(scanner);
	                    break;
	                case 3:
	                    listTasks();
	                    break;
	                case 4:
	                    running = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
	            }
	        }
	        scanner.close();
	    }

	    private static void addTask(Scanner scanner) {
	        System.out.print("Enter task description: ");
	        String task = scanner.nextLine();
	        tasks.add(task);
	        System.out.println("Task added successfully.");
	    }

	    private static void removeTask(Scanner scanner) {
	        if (tasks.isEmpty()) {
	            System.out.println("Task list is empty.");
	            return;
	        }

	        System.out.println("Current tasks:");
	        listTasks();

	        System.out.print("Enter task number to remove: ");
	        int taskNumber = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character

	        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
	            tasks.remove(taskNumber - 1);
	            System.out.println("Task removed successfully.");
	        } else {
	            System.out.println("Invalid task number.");
	        }
	    }

	    private static void listTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("Task list is empty.");
	        } else {
	            System.out.println("Tasks:");
	            for (int i = 0; i < tasks.size(); i++) {
	                System.out.println((i + 1) + ". " + tasks.get(i));
	            }
	        }
	    }
	}
