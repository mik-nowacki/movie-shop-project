import axios from "axios";

const REST_API_BASE_URL = "http://localhost:8080/movies";

export const listMovies = () => axios.get(REST_API_BASE_URL);
