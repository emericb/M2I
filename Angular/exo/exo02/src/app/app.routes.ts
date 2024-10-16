import { Routes } from '@angular/router';
import { SeriesComponent} from './components/series/series.component';
import {CounterComponent} from './components/counter/counter.component';

export const routes: Routes = [
  { path: 'series', component: SeriesComponent },
  { path: 'counter', component: CounterComponent },
];
