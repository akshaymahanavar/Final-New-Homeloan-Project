import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RejectemailService {
  rejectmail:string="http://localhost:7777/mail/sendEmail/Reject/"
  constructor(private http:HttpClient) { }

  postmail(data:any)
  {
    alert("service");
  return this.http.post(this.rejectmail,data);
  }
}
