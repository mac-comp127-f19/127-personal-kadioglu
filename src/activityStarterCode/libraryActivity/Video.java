/**
 * A class to represent library videos
 *
 * @author Esra Kadioglu Fall 2019
 */

package activityStarterCode.libraryActivity;

public class Video implements Media {

    private String title;
    private String director;
    private int numCopies = 0;
    private int currentNumCopies;


    public Video(String title, String director, int numCopies) {
        this.title = title;
        this.director = director;
        this.numCopies = numCopies;
        this.currentNumCopies = numCopies;

    }

    public String getDirector() {
        return this.director;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + " by " + this.director + "\nAvailable copies: " + this.currentNumCopies;
    }

    /**
     * A method that checks a video out of the library.
     * If there is at least one copy, we can check it out (and set it one less)
     * If the video is not available, we cannot check it out.
     *
     * @return true if the requested video was checked out, and false if the video could not be checked out.
     */
    public boolean checkOut() {
        if (currentNumCopies > 0) {
            currentNumCopies--;
            return true;
        } else
            return false;
    }

    /**
     * A method that checks a video back in to the library.
     * If the all copies of the video is available, then we can't check it in--it's already here!
     * If at least one copy of the video is missing, we check it back in (and increment it by one).
     *
     * @return true if the video was checked in, and false if the video could not be checked in.
     */
    public boolean checkIn() {
        if (currentNumCopies < numCopies) {
            currentNumCopies ++;
            return true;
        } else //if (currentNumCopies == numCopies)
            return false;
    }
}