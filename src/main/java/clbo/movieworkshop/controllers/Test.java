package clbo.movieworkshop.controllers;

import clbo.movieworkshop.repositories.MovieDBRepository;

public class Test {

    public static void main(String[] args) {
        MovieDBRepository repo = new MovieDBRepository();

        System.out.println(repo.readAll());

        System.out.println(repo.read(3));
    }
}
