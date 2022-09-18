import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CustomerDetail } from '../model/customer-detail';
import { EnquiryForm } from '../model/enquiry-form';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private http:HttpClient) { }
  postenq:string="http://localhost:7777/api/sendenquiryform/";
  getenq:string = "http://localhost:7777/api/getenquiryforms/";
  
  url3:string="";
  postdata(enq:EnquiryForm)
  {
    console.log(enq.fullname+""+enq.email)
   return this.http.post(this.postenq,enq);
  }

  getdata():Observable<EnquiryForm[]> 
  {
    return this.http.get<EnquiryForm[]>(this.getenq);
  }


  
  
}
