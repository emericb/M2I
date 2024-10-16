import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  standalone: true,
  imports: [],
  templateUrl: './counter.component.html',
  styleUrl: './counter.component.css'
})
export class CounterComponent {

  count: number = 0;

  increment() {
    this.count++;
  }

  decrement() {
    this.count--;
  }

  getColor() {
    return this.count % 2 ? 'red' : 'green';
  }
}
