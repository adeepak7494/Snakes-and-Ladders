import java.util.*;

class Snake{
	static int w;
	static int ps1,ps2;
	Snake(){
		int[] su={27,40,43,54,66,76,89,99};
		int[] sd={5,3,18,31,45,58,53,41};
		int[] ld={4,13,33,42,50,62,74};
		int[] lu={25,46,49,63,69,81,92};
		w=0;
		ps1=0;
		ps2=0;
		while(ps1<100 && ps2<100){
			if(w%2==0){
				w++;
				System.out.println("Player1 chance");
				Random rand=new Random();
				int r=rand.nextInt(6)+1;
				if((ps1+r)<100){
					ps1=ps1+r;
					System.out.println("player1 is at   "+ps1);
					for(int i=0;i<su.length;i++){
						if(ps1==su[i]){
							ps1=sd[i];
							System.out.println("OOPS there is a snake Player1 has come down to "+ps1);
						}
					}
					for(int i=0;i<ld.length;i++){
						if(ps1==ld[i]){
							ps1=lu[i];
							System.out.println("Ohh.. there is a ladder Player1 has stepped to "+ps1);

						}
					}
				}
				else{
				      System.out.println("Player1 has won the game");
				      return;

				}
				System.out.println("\n");

			}
			else{
				w++;
				System.out.println("Player2 chance");
				Random rand=new Random();
				int r=rand.nextInt(6)+1;
				if((ps2+r)<100){
					ps2=ps2+r;
					System.out.println("player2 is at   "+ ps2);
					for(int i=0;i<su.length;i++){
						if(ps2==su[i]){
							ps2=sd[i];
							System.out.println("OOPS there is a snake Player2 has come down to  "+ps2);

						}
					}
					for(int i=0;i<ld.length;i++){
						if(ps2==ld[i]){
							ps2=lu[i];
							System.out.println("Ohh.. there is a ladder Player2 has stepped to  "+ps2);

						}
					}
				}
				else{
					System.out.println("Player2 has won the game");
					return;

				}
				System.out.println("\n");

			}
		}

	}
	public static void main(String[] args) {
		Snake s=new Snake();
	}
}