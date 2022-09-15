import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EnquiryForm } from '../model/enquiry-form';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private http:HttpClient) { }
  url:string="http://localhost:7777/api/sendenquiryform"
  url1:string = "http://localhost:7777/api/getenquiryforms";
  postdata(enq:EnquiryForm)
  {
    console.log(enq.fullname+""+enq.email)
   return this.http.post(this.url,enq);
  }

  getdata():Observable<EnquiryForm[]> 
  {
    return this.http.get<EnquiryForm[]>(this.url1);
  }
}
