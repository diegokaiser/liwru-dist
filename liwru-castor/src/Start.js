import React from "react";

const Start = () => {
  return (
    <div className="liwru">
      <div className="liwru-home">
        <h2>Libro de Reclamaciones</h2>
        <p>
          Antes de iniciar el registro de tu reclamo, toma en cuenta que las
          indemnizaciones por daños y perjuicios se solicitan a través de la vía
          jurisdiccional correspondiente (Poder Judicial) y también podrás
          considerar la regulación del arbitraje de consumo.
        </p>
        <div className="liwru-actions">
          <a className="liwru-actions-goon gotoIncidencia">
            Hacer un reclamo o queja
          </a>
          <a className="liwru-actions-goon gotoSearcher">
            Ver mi reclamo o queja
          </a>
        </div>
      </div>
      <div className="liwru-actions outside">
        <a
          href="https://api.whatsapp.com/send?phone=51993119898"
          className="liwru-actions-goon gotoWhatsapp"
        >
          <i className="fas-fa-whatsapp"></i> ¡Hola! ¿Cómo te puedo ayudar?
        </a>
      </div>
    </div>
  );
};

export default Start;
