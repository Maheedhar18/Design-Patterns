package singleton_pattern;

import java.util.*;

// The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

public class ScrabbleTest {
    
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance 1 ID : " +System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player 1 : "+playerOneTiles);
        System.out.println(newInstance.getLetterList());
        Singleton instanceTwo = Singleton.getInstance();
        System.out.println("Instance 2 ID : " +System.identityHashCode(instanceTwo));
        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
        System.out.println("Player 2 : "+playerTwoTiles);
        System.out.println(newInstance.getLetterList());

    }

}
