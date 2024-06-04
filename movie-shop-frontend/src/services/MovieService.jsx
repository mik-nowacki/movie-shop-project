import axios from "axios";

const REST_API_BASE_URL = "http://localhost:8080/movies";
const MOVIE_DETAILS_URL = "http://localhost:8080/movie";

export const listMovies = () => axios.get(REST_API_BASE_URL);

export const movieDetails = () => axios.get(MOVIE_DETAILS_URL);
