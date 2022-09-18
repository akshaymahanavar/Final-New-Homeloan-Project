import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Cibil } from '../model/cibil';

@Injectable({
  providedIn: 'root'
})
export class CibilService {
  getcibilscore:string = "http://localhost:7777/cibil/cibilscore/";

  postcibilscore:string="http://localhost:7777/cibil/sendchecklist/";

  getchecklistsapprove :string="http://localhost:7777/cibil/getchecklists/approve/"

  getchecklistsreject :string="http://localhost:7777/cibil/getchecklists/reject/"

  constructor(private http:HttpClient) { }

  getcibil():Observable<number> 
  {
    return this.http.get<number>(this.getcibilscore);
  }

  postcibil(cibil:any,formno:number)
  {
    return this.http.post(this.postcibilscore+formno,cibil);
  }
     //approve
  getchecklist():Observable<Cibil[]> 
  {
    return this.http.get<Cibil[]>(this.getchecklistsapprove);
  }
  getrejectdata():Observable<Cibil[]> 
  {
    return this.http.get<Cibil[]>(this.getchecklistsreject);
  }

}
