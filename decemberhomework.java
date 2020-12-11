Scanner scanner = new Scanner(in);
        //Targil 1 :
        System.out.println("Please Enter a number for number1 , number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 == 0 && number2 == 0) {
            System.out.println("both zeroes");
        } else {
            out.println("not both zeroes");
        }

        //Targil 2 :
        System.out.println("Please Enter a number for a,b,c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a != b && b != c && a != c) {
            System.out.println("different");
        }
        else {
            out.println("similar");
        }

        //Targil 3:
        System.out.println("Please Enter a number for x,y,z");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        if (x > 0 && y > 0 && z > 0) {
             out.print("3 positive");
        }
        else if (x > 0 && y > 0 || x > 0 && z > 0 || y > 0 && z > 0) {
             out.println("2 positive");
        }
        else if (x > 0 || y > 0 || z > 0) {
             out.println("1 positive");
        }
        else {
             out.println("0 positive");
        }


        //Targil 4
        System.out.println("Please Enter a number for a,b,c");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        if (a1 = b1 && a1 = c1 && b1 = c1) {
              out.println("all same");
        }
          else if (a1 > b1 && a1 > c1) {
            out.println("a is the biggest");
        }
          else if (b1 > c1)  {
              out.println("b is the biggest");
        }
         else {
             out.println("c is the biggest");
        }

         System.out.println("'Goodbye...");
         
         
