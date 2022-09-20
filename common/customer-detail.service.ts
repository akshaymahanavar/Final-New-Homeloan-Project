import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Address } from '../model/address';
import { BankDetails } from '../model/bank-details';
import { CustomerDetail } from '../model/customer-detail';
import { Document } from '../model/document';

@Injectable({
  providedIn: 'root'
})
export class CustomerDetailService {

customer:CustomerDetail
  postcusturl:string="http://localhost:7777/sendcustomerdetails/";

  postaddrurl:string="http://localhost:7777/sendAddress/";

  postbankurl:string="http://localhost:7777/sendbankdetail/";

  postdocurl:string="http://localhost:7777/savedocumnent/";

  getcustomerurl:string="http://localhost:7777/getalldata "

  constructor(private http:HttpClient) { }
  c:CustomerDetail={
    customerid: 0,
    fullname: '',
    mobileno: 0,
    age: 0,
    gender: '',
    dob: '',
    addr: new Address,
    bank: new BankDetails,
    document: new Document
  }


postcustomer(customer:CustomerDetail): Observable<CustomerDetail> 
{
 return this.http.post<CustomerDetail>(this.postcusturl,customer)

}
postaddress(addr:Address)
{ alert("id"+this.c.customerid);
  
  return this.http.post(this.postaddrurl+this.c.customerid,addr);
}

postbank(bank:BankDetails)
{
  return this.http.post(this.postbankurl+this.c.customerid,bank);
}
savedocument(doc:any) 
{
  alert("docid:"+doc.docid);
  return this.http.post(this.postdocurl+this.c.customerid,doc);
}


getcustomer():Observable<CustomerDetail[]>
{ 
  return this.http.get<CustomerDetail[]>(this.getcustomerurl);
}
}
