//package player;

/*
 * 
 * Contribution for a file named Test_Play_List.java by Nat30b
 * 
 */
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * Contribution for a file named Test_Play_List.java by Nat30b
 */
public class Test_Play_List {
	
	static LinkedList<Song> playlist=new LinkedList<Song>();
	static Player plr=new Player();
    private static ArrayList<Play_List> play_lists = new ArrayList<Play_List>();
    
     public static void main(String[] args) {
    
        
		main();
        plr.play(playlist);
    }
   public static void main()
		{
			Play_List play_list = new Play_List("Ereft", "Yohana");
		
        play_list.addSong("Nabloda", 343);
        play_list.addSong("Sakesh Yegodal", 334);
        play_list.addSong("Edil", 347);
        play_list.addSong("Berta", 449);
        play_lists.add(play_list);
        
        play_list=new Play_List("Arcane League of Legends", "VA");
        play_list.addSong("Playground", 352);
        play_list.addSong("Enemy", 255);
        play_list.addSong("Dynasties and Dynstopia", 300);
        play_lists.add(play_list);
        
        
        play_list.addSongToPlaylist("Playground", playlist);
        play_list.addSongToPlaylist("Nabloda", playlist);
        play_list.addSongToPlaylist("Berta", playlist);
        play_list.addSongToPlaylist("Dynasty and Dynstopia", playlist);
		}  
}
