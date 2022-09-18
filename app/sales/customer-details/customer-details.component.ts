import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerDetailService } from 'src/app/common/customer-detail.service';
import { CustomerDetail } from 'src/app/model/customer-detail';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  constructor(private fb:FormBuilder , private cs:CustomerDetailService,private router:Router) { }
  customerform:FormGroup
  ngOnInit(): void {
    this.customerform=this.fb.group({
      customerid:[''],
      fullname:[''],
        mobileno:[''],
        age:[''],
        gender:[''],
        dob:['']
    })
  }
  cust:CustomerDetail;


  savecustomer(){
    this.cs.postcustomer(this.customerform.value).subscribe(data=>{
      this.cust=data
    });
    alert(this.cust.customerid);
    alert(this.cust.fullname);
    this.cs.c.customerid=this.cust. customerid ;
    this.router.navigate(['login/sales','addressdetail']); //,this.cust.customerid
   
  }
}
