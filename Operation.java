import java.util.Scanner;

public class Operation {
    Student root;
    Scanner sc = new Scanner(System.in);
    public Operation()
    {
        root = null;
    }
    public void InsertData()
    {
        Student n = new Student();
        System.out.println("Enter name: ");
         n.name = sc.nextLine();

         while(true)
         {

             System.out.println("Enter CGPA ");
             n.cgpa = sc.nextDouble();
             sc.nextLine();
             if(n.cgpa>=0.0 && n.cgpa<=4.0)
             {
                break;
             }
             else 
             {
                System.out.println("Invalid CGPA.Please enter a value between 0.0 and 4.0.");
             }
            }

        System.out.println("Enter course name to enroll: ");
        n.course = sc.nextLine();

        while(true)
         {

            System.out.println("Enter Marks ");
            n.marks = sc.nextInt();
            sc.nextLine();
             if(n.marks>=0 && n.marks<=100)
             {
                break;
             }
             else 
             {
                System.out.println("Invalid marks.Please enter  marks between 0 and 100.");
             }
            }
        
        
        int roll = (int) (Math.random()*1000)+1;
        n.roll = roll;
        System.out.println("Roll of " + n.name + " is " + roll);
        root = insertDataRec(root,n);
    }
    public Student insertDataRec(Student root,Student newStudent)
    {
        if(root==null)
        {
            root = newStudent;
            return root;
        }
        else if(newStudent.roll<root.roll)
        {
            root.left = insertDataRec(root.left, newStudent);
        }
        else if(newStudent.roll>root.roll)
        {
            root.right = insertDataRec(root.right, newStudent);
        }
        else {
            System.out.println("Student with this roll number already exists.");
        }
        return root;
    }
    public void inOrder(Student root)
    {
        
        if(root!=null)
        {
            inOrder(root.left);
                System.out.println("\n------------------------------");
                System.out.println("📚 Name   : " + root.name);
                System.out.println("🆔 Roll   : " + root.roll);
                System.out.println("🎓 CGPA   : " + root.cgpa);
                System.out.println("📖 Course : " + root.course);
                System.out.println("📊 Marks  : " + root.marks);
                System.out.println("------------------------------");
            inOrder(root.right);
        }
    }
    public void preOrder(Student root)
    {
        
        if(root!=null)
        {
           System.out.println("\n------------------------------");
                System.out.println("📚 Name   : " + root.name);
                System.out.println("🆔 Roll   : " + root.roll);
                System.out.println("🎓 CGPA   : " + root.cgpa);
                System.out.println("📖 Course : " + root.course);
                System.out.println("📊 Marks  : " + root.marks);
                System.out.println("------------------------------");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(Student root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
             System.out.println("\n------------------------------");
                System.out.println("📚 Name   : " + root.name);
                System.out.println("🆔 Roll   : " + root.roll);
                System.out.println("🎓 CGPA   : " + root.cgpa);
                System.out.println("📖 Course : " + root.course);
                System.out.println("📊 Marks  : " + root.marks);
                System.out.println("------------------------------");
        }

    }
    public void Search_Data()
    {
        System.out.println("Enter roll number to search the data: ");
        int roll = sc.nextInt();
        boolean found  = SearchDataRecursive(root, roll);
        if(found)
        {
            System.out.println("Student with roll number " + roll + " found");
        }
        else
        {
            System.out.println("Student with roll number " + roll + " not found");
        }
    }
    public boolean SearchDataRecursive(Student root, int item)
    {
        if(root==null)
        {
            return false;
        }
        else if(item<root.roll)
        {
            return SearchDataRecursive(root.left, item);
        }
        else if (item > root.roll) { 
            return SearchDataRecursive(root.right, item); 
          } 
          else { 
            return true; 
          } 
    }
    public void DeleteStudent()
    {
        System.out.println("Enter roll number to delete the data: ");
        int roll = sc.nextInt();
        sc.nextLine();
        boolean found  = SearchDataRecursive(root, roll);
        if(!found)
        {
            System.out.println("Student with roll number " + roll + " not found");
        }
        else
        {
            root = DeleteStudentRec(root,roll);
            System.out.println("Student with roll number " + roll + " deleted successfully");
        }
    }
    public int findMin(Student root)
    {
        while(root.left!=null)
        {
            root = root.left;
        }
        return root.roll;
    }
    public Student DeleteStudentRec(Student root,int data)
    {
        if(root==null)
        {
            System.out.println("No student record found with roll number: " + data);
            return null;
        }
        else if(data<root.roll)
        {
            root.left = DeleteStudentRec(root.left, data);
        }
        else if(data>root.roll)
        {
            root.right = DeleteStudentRec(root.right, data);
        }
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.roll = findMin(root.right);
            root.right = DeleteStudentRec(root.right, root.roll);
        }
        return root;
    }
}
