import React from "react";
import check from "../assets/images/check.svg";
import { Link } from "react-router-dom";

export const StepOne = () => {
  return (
    <div className="liwru">
      <div className="liwru-home step xs-height">
        <div className="liwru-steps">
          <div className="liwru-steps-step completed">
            <span>
              <img src={check} alt="completado!" />
            </span>
          </div>
          <div className="liwru-steps-step current">
            <span>2</span>
          </div>
          <div className="liwru-steps-step">
            <span>3</span>
          </div>
          <div className="liwru-steps-step">
            <span>4</span>
          </div>
        </div>
        <h2>Datos personales</h2>
        <div className="liwru-forms steps">
          <div className="liwru-forms-row">
            <div className="liwru-forms-group">
              <strong>Nombres *</strong>
              <input type="number" placeholder="Ingresa tus nombres" />
            </div>
            <div className="liwru-forms-group">
              <strong>Apellido Paterno *</strong>
              <input type="number" placeholder="Ingresa tu apellido paterno" />
            </div>
            <div className="liwru-forms-group">
              <strong>Apellido Materno *</strong>
              <input type="number" placeholder="Ingresa tu apellido materno" />
            </div>
          </div>

          <div className="liwru-forms-row">
            <div className="liwru-forms-group">
              <strong>Tipo de Documento *</strong>
              <select>
                <option disabled selected>
                  Selecciona
                </option>
                <option>DNI</option>
                <option>Pasaporte</option>
                <option>Carnet de Extranjeria</option>
              </select>
            </div>
            <div className="liwru-forms-group">
              <strong>Nro. de Documento *</strong>
              <input type="number" placeholder="Ingresa tu nro. de documento" />
            </div>
            <div className="liwru-forms-group">
              <strong>Correo electrónico *</strong>
              <input type="number" placeholder="Ingresa tu correo" />
            </div>
          </div>

          <div className="liwru-forms-row">
            <div className="liwru-forms-group">
              <strong>Tipo de Respuesta *</strong>
              <select>
                <option disabled selected>
                  Selecciona
                </option>
                <option>Por correo electrónico</option>
                <option>Por llamada telefónica</option>
              </select>
            </div>
            <div className="liwru-forms-group">
              <strong>Dirección *</strong>
              <input type="number" placeholder="Ingresa tu dirección" />
            </div>
            <div className="liwru-forms-group">
              <strong>Teléfono *</strong>
              <input type="number" placeholder="Ingresa tu teléfono" />
            </div>
          </div>

          <div className="liwru-forms-row">
            <div className="liwru-forms-group">
              <strong>Departamento *</strong>
              <select>
                <option disabled selected>
                  Selecciona
                </option>
                <option value="A">Amazonas</option>
                <option value="B">Áncash</option>
                <option>Apurímac</option>
                <option>Arequipa</option>
                <option>Ayacucho</option>
                <option>Cajamarca</option>
                <option>Cusco</option>
                <option>Huancavelica</option>
                <option>Huánuco</option>
                <option>Ica</option>
                <option>Junín</option>
                <option>La Libertad</option>
                <option>Lambayeque</option>
                <option>Lima</option>
                <option>Loreto</option>
                <option>Madre de Dios</option>
                <option>Moquegua</option>
                <option>Pasco</option>
                <option>Piura</option>
                <option>Puno</option>
                <option>San Martín</option>
                <option>Tacna</option>
                <option>Tumbes</option>
                <option>Ucayali</option>
              </select>
            </div>
            <div className="liwru-forms-group">
              <strong>Provincia *</strong>
              <select>
                <option>Seleccione</option>
              </select>
            </div>
            <div className="liwru-forms-group">
              <strong>Distrito *</strong>
              <select>
                <option>Seleccione</option>
              </select>
            </div>
          </div>
        </div>
        <div className="liwru-actions fixed">
          <Link to="/step-zero" className="liwru-actions-goback">
            Volver
          </Link>
          <Link to="/step-two" className="liwru-actions-goon">
            Siguiente
          </Link>
        </div>
      </div>
    </div>
  );
};

// figma: paso 1
