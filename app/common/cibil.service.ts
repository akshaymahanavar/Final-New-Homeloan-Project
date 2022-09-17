import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class CibilService {
  getcibilscore:string = "http://localhost:7777/cibil/cibilscore/";

  postcibilscore:string="http://localhost:7777/cibil/sendchecklist/";
  constructor(private http:HttpClient) { }

  getcibil():Observable<number> 
  {
    return this.http.get<number>(this.getcibilscore);
  }

  postcibil(cibil:any,formno:number)
  {
    return this.http.post(this.postcibilscore+formno,cibil);
  }

}
