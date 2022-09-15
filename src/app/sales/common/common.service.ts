import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { EnquiryForm } from '../model/enquiry-form';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private http:HttpClient) { }
  url:string="http://localhost:7777/api/sendenquiryform"
  postdata(enq:EnquiryForm)
  {
    console.log(enq.fullname+""+enq.email)
   return this.http.post(this.url,enq);
  }
}
