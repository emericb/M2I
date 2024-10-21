import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ChuckNorrisService {

  private API_URL = 'https://api.chucknorris.io/jokes/random';

  constructor(private http: HttpClient) { }

  getRandomJoke() : Observable<any> {
    return this.http.get<any>(this.API_URL);
  }
}
