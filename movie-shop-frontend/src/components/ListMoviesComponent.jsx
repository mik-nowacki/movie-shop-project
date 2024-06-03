import React, { useEffect, useState } from "react";
import { listMovies } from "../services/MovieService";

const ListMoviesComponent = () => {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    listMovies()
      .then((response) => {
        setMovies(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  }, []);

  return (
    <div className="container">
      <h2 className="text-center">List of Movies</h2>
      <table className="table .table-striped table-bordered">
        <thead>
          <tr>
            <th>Title</th>
            <th>Category</th>
            <th>Year</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {movies.map((movie) => (
            <tr key={movie.id}>
              <td>{movie.title}</td>
              <td>{movie.category}</td>
              <td>{movie.releaseYear}</td>
              <td>{movie.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ListMoviesComponent;
