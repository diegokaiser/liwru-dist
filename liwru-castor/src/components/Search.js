import React, { useState } from "react";
import { Link } from "react-router-dom";

export const Search = () => {
  const [askForQuery, setaskForQuery] = useState(null);
  let codigoIncidencia;
  function handleChange(event) {
    setaskForQuery(event.target.value);
    codigoIncidencia = askForQuery;
    console.log(event.target.value);
    console.log("askForQuery" + askForQuery);
    console.log("codigoIncidencia" + codigoIncidencia);
  }
  function qi() {}
  return (
    <div className="liwru">
      <div className="liwru-home xs-height">
        <h2>Ver el estado de mi incidencia</h2>
        <p className="search">
          Te informamos que según la Ley Nro. 29733, Ley de Protección de datos
          Personales, todos los dato personales proporcionados son tratados y/o
          proporcionados por el Indecopi.
        </p>
        <p>
          En el caso de las medidas correctivas y sanciones, se dan según el
          marco de una denuncia administrativa (Sumarísmo y Ordinario).
        </p>
        <div className="liwru-forms success">
          <div className="liwru-forms-group">
            <strong>Código de incidencia *</strong>
            <input
              type="text"
              name="codigoIncidencia"
              placeholder="Digita tu código"
              onChange={handleChange}
            />
          </div>
        </div>
        <div className="liwru-actions fixed">
          <Link to="/empezar" className="liwru-actions-goback">
            Anterior
          </Link>
          <Link
            to={`./resultado/${codigoIncidencia}`}
            className="liwru-actions-goon"
            onClick={qi}
          >
            Siguiente
          </Link>
        </div>
      </div>
    </div>
  );
};

// figma: home 2
