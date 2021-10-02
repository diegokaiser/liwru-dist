import React from "react";
import check from "../assets/images/check.svg";
import trash from "../assets/images/trash.svg";
import plus from "../assets/images/plus.svg";
import { Link } from "react-router-dom";

export const StepTwo = () => {
  return (
    <div className="liwru">
      <div className="liwru-home step xs-height">
        <div className="liwru-steps">
          <div className="liwru-steps-step completed">
            <span>
              <img src={check} alt="completado!" />
            </span>
          </div>
          <div className="liwru-steps-step completed">
            <span>
              <img src={check} alt="completado!" />
            </span>
          </div>
          <div className="liwru-steps-step current">
            <span>3</span>
          </div>
          <div className="liwru-steps-step">
            <span>4</span>
          </div>
        </div>
        <h2>Información general</h2>
        <div className="liwru-forms steps">
          <div className="liwru-forms-row just-one">
            <div className="liwru-forms-group">
              <strong>¿Qué tipo de incidente deseas registrar?</strong>
              <div className="liwru-forms-group-subgroup">
                <label>
                  <input type="checkbox" /> Reclamo
                </label>
                <label>
                  <input type="checkbox" /> Queja
                </label>
              </div>
            </div>
          </div>

          <div className="liwru-forms-row">
            <div className="liwru-forms-group">
              <strong>Motivo &lt;del/de la&gt; &lt;reclamo/queja&gt; *</strong>
              <select>
                <option>Seleccione</option>
              </select>
            </div>
          </div>

          <div className="liwru-forms-row just-one">
            <div className="liwru-forms-group">
              <strong>¿El incidente fue en un establecimiento físico?</strong>
              <div className="liwru-forms-group-subgroup">
                <label>
                  <input type="checkbox" /> Sí
                </label>
                <label>
                  <input type="checkbox" /> No
                </label>
              </div>
            </div>
          </div>

          <div className="liwru-forms-row">
            <div className="liwru-forms-group">
              <strong>Seleccionar establecimiento *</strong>
              <select>
                <option>Seleccione</option>
              </select>
            </div>
          </div>

          <div className="liwru-forms-row align-items-end">
            <div className="liwru-forms-group">
              <strong>Fecha de Incidencia *</strong>
              <input type="date" placeholder="Registre la fecha" />
            </div>
            <div className="liwru-forms-group">
              <label>
                <input type="checkbox" /> Esta es una fecha aproximada
              </label>
            </div>
            <div className="liwru-forms-group"></div>
          </div>

          <div className="liwru-forms-row just-one">
            <div className="liwru-forms-group">
              <strong>¿Tienes documentos relacionados a la incidencia?</strong>
              <div className="liwru-forms-group-subgroup">
                <label>
                  <input type="checkbox" /> Sí
                </label>
                <label>
                  <input type="checkbox" /> No
                </label>
              </div>
            </div>
          </div>

          <div className="liwru-forms-row just-two align-items-end files">
            <div className="liwru-forms-group">
              <strong>Agregar el documento *</strong>
              <input type="file" />
            </div>
            <div className="liwru-forms-group">
              <strong></strong>
              <button class="liwru-actions-files">
                <img src={trash} alt="Eliminar documento" />
              </button>
            </div>
          </div>

          <div className="liwru-forms-row just-two align-items-end files">
            <div className="liwru-forms-group">
              <input type="file" />
            </div>
            <div className="liwru-forms-group">
              <strong></strong>
              <button class="liwru-actions-files">
                <img src={plus} alt="Agregar documento" />
              </button>
            </div>
          </div>

          <div className="liwru-forms-row just-two">
            <div className="liwru-forms-group">
              <strong>Detalle del reclamo *</strong>
              <textarea></textarea>
            </div>
            <div className="liwru-forms-group">
              <strong>Pedido *</strong>
              <textarea></textarea>
            </div>
          </div>
        </div>
        <div className="liwru-actions fixed">
          <Link to="/step-one" className="liwru-actions-goback">
            Volver
          </Link>
          <Link to="/step-three" className="liwru-actions-goon">
            Siguiente
          </Link>
        </div>
      </div>
    </div>
  );
};

// figma: paso 2
