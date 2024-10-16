import {Component} from '@angular/core';
import {NgForOf, NgIf} from '@angular/common';
import {OrderByPipe} from '../../pipes/order-by.pipe';

interface Series {
  name: string;
  description: string;
}

@Component({
  selector: 'app-series',
  standalone: true,
  imports: [
    NgForOf,
    NgIf,
    OrderByPipe
  ],
  templateUrl: './series.component.html',
  styleUrl: './series.component.css'
})
export class SeriesComponent {
  seriesList: Series[] = [
    {name: 'Series 1', description: 'Description of Series 1'},
    {name: 'Series 2', description: 'Description of Series 2'},
    {name: 'Series 3', description: 'Description of Series 3'}
  ];

  order: string = 'asc';

  deleteSeries(index: number): void {
    this.seriesList.splice(index, 1);
  }

  setOrder(order: string): void {
    this.order = order;
  }
}
