import "./App.css";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import ListMoviesComponent from "./components/ListMoviesComponent";
import { useEffect } from "react";
import { listMovies } from "./services/MovieService";
import MovieDetailsComponent from "./components/MovieDetailsComponent";

function App() {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    const fetchMovies = async () => {
      try {
        const response = await axios.get("http://localhost:8080");
        setMovies(response.data.movies);
      } catch (error) {
        console.error("Error fetching movies:", error);
      }
    };
    fetchMovies();
  }, []);

  const router = createBrowserRouter([
    {
      path: "/movies",
      element: <ListMoviesComponent movies={movies} />,
    },
    {
      path: "/movie/:id",
      element: <MovieDetailsComponent movies={movies} />,
    },
  ]);
  return <RouterProvider router={router} />;
}

export default App;
