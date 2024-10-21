import {Component, OnInit} from '@angular/core';
import {ChuckNorrisService} from '../services/chuck-norris.service';

@Component({
  selector: 'app-chuck-norris',
  standalone: true,
  imports: [],
  templateUrl: './chuck-norris.component.html',
  styleUrl: './chuck-norris.component.css'
})
export class ChuckNorrisComponent implements OnInit {
  joke: string = '';

  constructor(private chuckNorrisService: ChuckNorrisService) { }

  ngOnInit() {
    this.loadJoke();
  }

  loadJoke() {
    this.chuckNorrisService.getRandomJoke().subscribe((response) => {
      this.joke = response.value;
    });
  }
}
