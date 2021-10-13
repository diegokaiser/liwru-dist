export const getDataIncidencia = async () => {
  const url = "//localhost:9000/api/";
  const idI = "2";
  // const url = "//bcp.liwru.app/pollux/api/";
  const uri = url + "incidencias/" + idI;
  const response = await fetch(uri);
  const data = await response.json();
  const incidencia = {
    agraviado: data.agraviado.clienteNombre,
    tipo: data.tipoIncidencia.descripcion,
    estado: data.estado.estadoDescripcion,
    medio: data.tipoAtencion,
    correo: data.agraviado.clienteEmail,
    telefono: data.agraviado.clienteTelefono,
  };

  return incidencia;
};
