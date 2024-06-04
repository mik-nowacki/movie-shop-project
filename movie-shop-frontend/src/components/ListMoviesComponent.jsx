import React, { useEffect, useState } from "react";
import { listMovies } from "../services/MovieService";
import MovieItemComponent from "./MovieItemComponent";

const ListMoviesComponent = ({ movies }) => {
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

  // return (
  //   <div className="container">
  //     <h2 className="text-center">Browse movies:</h2>
  //     <table className="table .table-striped table-bordered">
  //       <thead>
  //         <tr>
  //           <th>Title</th>
  //           <th>Category</th>
  //           <th>Year</th>
  //           <th>Price</th>
  //         </tr>
  //       </thead>
  //       <tbody>
  //         {movies.map((movie) => (
  //           <tr key={movie.id}>
  //             <td>{movie.title}</td>
  //             <td>{movie.category}</td>
  //             <td>{movie.releaseYear}</td>
  //             <td>{movie.price}</td>
  //           </tr>
  //         ))}
  //       </tbody>
  //     </table>
  //   </div>
  // );

  return (
    <div>
      <h2>Browse movies</h2>
      <ul>
        <MovieItemComponent
          key={movies.id}
          id={movies.id}
          title={movies.title}
          releaseYear={movies.releaseYear}
        />
      </ul>
    </div>
  );
};

export default ListMoviesComponent;
