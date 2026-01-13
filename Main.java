import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Operation op = new Operation();
        do {
            System.out.println("\n----Welcome to Student Management System----\n");
            System.out.println("1.Insert Student data");
            System.out.println("2.Delete Student data");
            System.out.println("3.Show Student data");
            System.out.println("4.Search Student data");
            System.out.println("5.Exit the program");

            System.out.print("Enter a choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    op.InsertData(); 
                    break;
                case 2:
                    op.DeleteStudent();
                    break;
                case 3:                
                System.out.println("\nPrinting Data in Preorder:");
                    op.preOrder(op.root);
                System.out.println("\nEnd of preorder Traversal\n");

                System.out.println("\nPrinting Data in Inorder:");
                    op.inOrder(op.root);
                System.out.println("\nEnd of Inorder Traversal\n");
                
                System.out.println("\nPrinting Data in Postorder:");
                    op.postOrder(op.root);
                System.out.println("\nEnd of Postorder Traversal\n");
                    break;
                case 4:
                    op.Search_Data();
                    break;    
                case 5:
                    System.out.println("Exiting the program.Goodbye!");
                    break;    
                default:
                    System.out.println("Invalid choice, Try again");
            }
        } while (choice!=5);
        sc.close();
    }
}
