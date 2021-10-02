import React, { Component } from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import { Results } from './components/Results';
import { Search } from './components/Search';
import { Start } from './components/Start';
import { StepOne } from './components/StepOne';
import { StepThree } from './components/StepThree';
import { StepTwo } from './components/StepTwo';
import { StepZero } from './components/StepZero';
import { Success } from './components/Success';

class App extends Component {
  render() {
    return (
      <BrowserRouter>
        <Switch>
          <Route path="/step-zero" component={StepZero} />
          <Route path="/step-one" component={StepOne} />
          <Route path="/step-two" component={StepTwo} />
          <Route path="/step-three" component={StepThree} />
          <Route path="/success" component={Success} />
          <Route path="/buscar-incidencia" component={Search} />
          <Route path="/resultado" component={Results} />
          <Route path="**" component={Start} />
        </Switch>
      </BrowserRouter>
    );
  }
}

export default App;