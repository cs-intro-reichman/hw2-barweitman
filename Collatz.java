// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
		String mode = args[1];
        for(int i = 1; i <= number; i++){
            int seed = i;
            int steps = 0;
            if(steps == 0 && seed == 1){
				if (mode.equals("v")){
					steps++;
					System.out.print(seed + " ");
				}
                seed = seed * 3 + 1;
            }
            while (seed != 1) {
				if (mode.equals("v"))
					System.out.print(seed + " ");
                if(seed % 2 == 0){
                    seed = seed / 2;
                }
                else{
                    seed = seed * 3 + 1;
                }  
				steps = steps + 1;
            }
			if (mode.equals("v")){
				steps++;
            	System.out.println(1 + " (" + steps + ")");
			}
        }
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
    }
}
