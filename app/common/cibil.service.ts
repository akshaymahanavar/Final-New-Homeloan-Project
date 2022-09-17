import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class CibilService {
  getcibilscore:string = "http://localhost:7777/cibil/cibilscore/";
  constructor(private http:HttpClient) { }

  getcibil():Observable<number> 
  {
    return this.http.get<number>(this.getcibilscore);
  }

}
