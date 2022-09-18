import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Address } from '../model/address';
import { BankDetails } from '../model/bank-details';
import { CustomerDetail } from '../model/customer-detail';

@Injectable({
  providedIn: 'root'
})
export class CustomerDetailService {

customer:CustomerDetail
  postcusturl:string="http://localhost:7777/sendcustomerdetails/";
  // getenq:string = "http://localhost:7777/api/getenquiryforms/";
  postaddrurl:string="http://localhost:7777/sendAddress/";

  constructor(private http:HttpClient) { }
  c:CustomerDetail={
    customerid: 0,
    fullname: '',
    mobileno: 0,
    age: 0,
    gender: '',
    dob: '',
    addr: new Address,
    bank: new BankDetails
  }


postcustomer(customer:CustomerDetail): Observable<CustomerDetail> 
{
 return this.http.post<CustomerDetail>(this.postcusturl,customer)

}
postaddress(addr:Address)
{ alert("id"+this.c.customerid);
  
  return this.http.post(this.postaddrurl+this.c.customerid,addr);
}

}
