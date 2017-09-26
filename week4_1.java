package week4_1;
import java.util.ArrayList;
public class Database 
{
     private ArrayList<Item> listItem = new ArrayList<Item>();
 
     public void add(Item item)
     {
          listItem.add(item);
     }
 
     public void list()
     {
          for(Item item : listItem)
          {
               item.print();
          }
     }
 
     public static void main(String[] args) 
     {
          Database database = new Database();
         
          database.add(new MP3("Ready for it", 3, true, "Good", "Taylor Swift", 2));
          database.add(new DVD("BoJack Horseman", 60, true, "Great","Amy"));
          database.add(new CD("This is us", 18, true, "Amazing","John", 5));
          
          database.list();
     }
}

package week4_1;
public class Item 
{
     private String title;
     private int playingTime;
     private boolean gotIt = false;
     private String comment;
     
     public Item(String title, int playingTime, boolean gotIt, String comment) 
     {
          super();
          this.title = title;
          this.playingTime = playingTime;
          this.gotIt = true;
          this.comment = comment;
     }
     
     public void print()
     {
          System.out.println("title: " + title);
          System.out.println("playingTime: " + playingTime);
          System.out.println("gotIt: " + gotIt);
          System.out.println("comment: " + comment);
     }
}

package week4_1;
public class MP3 extends Item
{
     private String singer;
     private int numofTracks;
     
     public MP3(String title, int playingTime, boolean gotIt, String comment, String singer, int numofTracks) 
     {
          super(title, playingTime, gotIt, comment);
          this.singer = singer;
          this.numofTracks = numofTracks;
     }
     
     public void print()
     {
          System.out.println("MP3: ");
          super.print();
          System.out.println("singer: " + singer);
          System.out.println("numofTracks: " + numofTracks);
     }
}

package week4_1;
public class DVD extends Item
{
     private String director;
     public DVD(String title, int playingTime, boolean gotIt, String comment, String director) 
     {
          super(title, playingTime, gotIt, comment);
          this.director = director;
     }
     
     public void print()
     {
          System.out.println("DVD: ");
          super.print();
          System.out.println("director: " + director);
     }
}

​package week4_1;
public class CD extends Item
{
     private String artist;
     private int numofTrack;
     
     public CD(String title, int playingTime, boolean gotIt, String comment, String artist, int numofTrack) 
     {
          super(title, playingTime, gotIt, comment);
          this.artist = artist;
          this.numofTrack = numofTrack;
     }
     
     public void print()
     {
          System.out.println("CD: ");
          super.print();
          System.out.println("artist: "+artist);
          System.out.println("numofTrack: "+numofTrack);
     }
}