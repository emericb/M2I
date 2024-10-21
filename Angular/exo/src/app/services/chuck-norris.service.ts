import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Joke} from '../utils/types/joke';

@Injectable({
  providedIn: 'root'
})
export class ChuckNorrisService {

  private API_URL = 'https://api.chucknorris.io/jokes/random';

  constructor(private http: HttpClient) { }

  getRandomJoke() : Observable<Joke> {
    return this.http.get<Joke>(this.API_URL);
  }
}
