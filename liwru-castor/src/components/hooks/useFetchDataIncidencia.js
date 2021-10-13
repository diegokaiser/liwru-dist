import { useEffect, useState } from "react";
import { getDataIncidencia } from "../helpers/getDataIndicencia";

export const useFetchDataIncidencia = () => {
  const [state, setState] = useState({
    data: [],
    loading: true,
  });

  useEffect(() => {
    getDataIncidencia().then((element) => {
      setState({
        data: element,
        loading: false,
      });
    });
  }, []);

  return state;
};
