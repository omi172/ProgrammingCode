import java.util.Scanner;
class arrayPlay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        while(true) {
            System.out.println("Array Created");
            System.out.println("Select 1 to insert at beginning");
            System.out.println("Select 2 to insert at end");
            System.out.println("Select 3 to remove from beginning");
            System.out.println("Select 4 to remove from end");
            System.out.println("Select 5 to exit");
            System.out.println("Select a number");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int newArr[] = new int[n + 1];
                    System.out.println("Enter an Array Element");
                    int number = sc.nextInt();
                    newArr[0] = number;
                    System.arraycopy(arr, 0, newArr, 1, n);
                    for (int ele : newArr) {
                        System.out.print(ele + " ");
                    }
                    n++;
                    arr = new int[n];
                    System.arraycopy(newArr, 0, arr, 0, n);
                    break;
                 }
                case 2:{
                    int newArr2[] = new int[n + 1];
                    System.out.println("Enter an Array Element");
                    int number = sc.nextInt();
                    newArr2[newArr2.length - 1] = number;
                    System.arraycopy(arr, 0, newArr2, 0, n);
                    for (int ele : newArr2) {
                        System.out.print(ele + " ");
                    }
                    n++;
                    arr = new int[n];
                    System.arraycopy(newArr2, 0, arr, 0, n);
                    break;
                }
                case 3:{
                    int newArr4[] = new int[n - 1];
                    System.arraycopy(arr, 1, newArr4, 0, n - 1);
                    for (int ele : newArr4) {
                        System.out.print(ele + " ");
                    }
                    n--;
                    arr = new int[n];
                    System.arraycopy(newArr4, 0, arr, 0, n);
                    break;
                }
                case 4:{
                    int newArr3[] = new int[n - 1];
                    System.arraycopy(arr, 0, newArr3, 0, n - 1);
                    for (int ele : newArr3) {
                        System.out.print(ele + " ");
                    }
                    n--;
                    arr = new int[n];
                    System.arraycopy(newArr3, 0, arr, 0, n);
                    break;
                }
                case 5: {
                    flag = true;
                    break;
                }
              }
              System.out.println();
              if(flag){
                  break;
              }
           }
        }
    }
