import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
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
      fullname:['',[Validators.required,Validators.minLength(8),Validators.maxLength(30)]],
        mobileno:['',[Validators.required,Validators.maxLength(10)]],
        age:['',[Validators.required]],
        gender:['',[Validators.required]],
        dob:['',[Validators.required]],
        email:['',[Validators.required]]
    })

  }
  cust:CustomerDetail;


  savecustomer(){
    this.cs.postcustomer(this.customerform.value).subscribe(data=>{
      this.cust=data
      this.cs.c.customerid=this.cust. customerid ;

    });
        this.router.navigate(['login/sales','addressdetail']); //,this.cust.customerid
   
   
  }
}
