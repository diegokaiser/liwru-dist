import React from "react";
import { Link } from "react-router-dom";
import { IncidenciaService } from "./services/IncidenciaService";

export const Results = () => {
  return (
    <div className="liwru">
      <div className="liwru-home xs-height">
        <IncidenciaService />
        <div className="liwru-actions fixed">
          <Link to="/" className="liwru-actions-goon">
            Volver
          </Link>
        </div>
      </div>
    </div>
  );
};

// figma: home 3
