package clbo.movieworkshop.repositories;

import clbo.movieworkshop.models.Movie;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDBRepository {

    private Connection conn = DatabaseConnectionManager.getConnection();

    List<Movie> movies;

    public MovieDBRepository(){
        this.movies = new ArrayList<>();

    }

    public Movie read(int id){
        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM Student WHERE id = ?");
            psts.setInt(1, id);
            ResultSet resultSet = psts.executeQuery();

            if(resultSet.next()){
                return new Movie (
                        resultSet.getString("year"),
                        resultSet.getString("length"),
                        resultSet.getString("title"),
                        resultSet.getString("subject"),
                        resultSet.getString("popularity"),
                        resultSet.getString("awards")

                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    // readAll
    public List<Movie> readAll(){
        return movies;
    }
}
