import java.util.Random;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int deck_size = arr.length;
        int deck_split = (deck_size+1)/2;
        int[] arr_shuffle = new int[deck_size];
        for(int i = 0; i<deck_split; i++){
            arr_shuffle[2*i] = arr[i]; 
            if(i+deck_split < deck_size){
                arr_shuffle[(2*i)+1] = arr[i+deck_split];
            }
        }
        return arr_shuffle;

    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int[] arr_2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr_2[i] = arr[i];
        }
        Random rand = new Random();
        for(int d = 0; d < arr_2.length; d++){
            int swap = rand.nextInt(arr_2.length);
            int temp = arr_2[d];
            arr_2[d] = arr_2[swap];
            arr_2[swap] = temp;
        }
        return arr_2;
    }


    public static void main(String[] args) {
        int [] test = {1, 2, 3, 4, 5, 6, 21, 22, 23, 24, 25};
        int [] shuffled_deck = perfectShuffle(test);
        for(int c = 0; c < test.length; c++){
            System.out.print(test[c] + " ");
        }
        System.out.println();
        for(int i = 0; i < shuffled_deck.length; i++){
            System.out.print(shuffled_deck[i] + " ");
        }
        System.out.println();
        System.out.println("Selection:");
        System.out.println();
        int [] test_copy = {1, 2, 3, 4, 5, 6, 21, 22, 23, 24, 25};
        int [] shuffled_deck_selection = selectionShuffle(test);
        for(int c = 0; c < test_copy.length; c++){
            System.out.print(test_copy[c] + " ");
        }
        System.out.println();
        for(int i = 0; i < shuffled_deck_selection.length; i++){
            System.out.print(shuffled_deck_selection[i] + " ");
        }
    }
}
