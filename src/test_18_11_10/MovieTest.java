package test_18_11_10;


import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;


public class MovieTest {



    private static Object toString;

    public static void main(String[] args) {

        System.out.println(new MovieClass("Venom", 2018, 10));


       List<MovieClass> movies = Arrays.asList(

                new MovieClass("Venom", 2018, 10),
                new MovieClass("Aquaman", 2018, 8),
                new MovieClass("Mile 22", 2018, 9),
                new MovieClass("Blade Runner 2049", 2017, 9),
                new MovieClass("Murder on the Orient Express", 2017, 8),
                new MovieClass("Baby Driver", 2017, 6),
                new MovieClass("Deadpool", 2016, 5),
                new MovieClass("Manchester by the Sea", 2016, 8),
                new MovieClass("The Invisible Guest", 2016, 7));

        System.out.println("Average: " + getAverage(movies));
        System.out.println(result(movies , 8));

    }


    public static float getAverage(List<MovieClass> movieList) {

        float sum = 0;
        int count = 0;


        for(MovieClass movie : movieList){

            if(movie.getYear() != 2017){
                sum += movie.getTicketPrice();
                count++;
            }
        }

        if (count == 0){
            return  0;
        }

        return  sum / count;
    }



    public static List<MovieClass> result(List<MovieClass> movieList, float givenPrice)
    {
        List<MovieClass> result = new ArrayList<>();
        for (MovieClass movie : movieList) {

            if (movie.getTicketPrice() > givenPrice) {
                result.add(movie);
            }

        }
        return result;
    }



   }











        //System.out.println(movies);











    // float ticketPriceValue  = MovieUtills.getPrice(movieInstance);

