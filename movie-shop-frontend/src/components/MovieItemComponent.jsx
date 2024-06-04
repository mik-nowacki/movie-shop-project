import React from "react";
import { Link } from "react-router-dom";

const MovieItemComponent = ({ id, title, releaseYear }) => {
  return (
    <li>
      <Link to={`/movies/${id}`}>{title}</Link> ({releaseYear})
    </li>
  );
};

export default MovieItemComponent;
