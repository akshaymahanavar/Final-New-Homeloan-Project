import { HttpClient } from '@angular/common/http';
import { Call } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { ApplicantDoc } from '../model/applicant-doc';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  url:string="http://localhost:8080/saveapplicant"
  url1:string="http://localhost:8080/getapplicant"

  constructor(private httpClient:HttpClient) { }

  saveApplicant(pr)
  {
    alert("calsss.....");
      return this.httpClient.post(this.url,pr);
  }
  getDocs():Observable<Document[]>
  {
    return this.httpClient.get<Document[]>(this.url1);
  }
}
