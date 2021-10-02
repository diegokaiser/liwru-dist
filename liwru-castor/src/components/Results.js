import React from "react";
import { Link } from "react-router-dom";

export const Results = () => {
  return (
    <div className="liwru">
      <div className="liwru-home xs-height">
        <h2>Mi &lt;incidencia&gt; está &lt;estado-incidencia&gt;</h2>
        <p className="alignCenter">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque
          ac volutpat urna. Ut posuere lorem et eros lacinia, et suscipit augue
          ullamcorper.
        </p>
        <div className="liwru-msg">
          <p>
            Phasellus blandit at ante ut pulvinar. Praesent eu lorem urna.
            Mauris dictum erat iaculis mauris rhoncus pharetra. Nam quis purus
            sit amet risus tincidunt tincidunt.
          </p>
        </div>
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
