import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerDetailService } from 'src/app/common/customer-detail.service';


@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css']
})
export class AddressComponent implements OnInit {
  customerid:number
  constructor(private fb:FormBuilder,private cs:CustomerDetailService,private routes:ActivatedRoute,private router:Router) { }
addressform:FormGroup
  ngOnInit(): void {

    this.addressform=this.fb.group({
      panno:[''],
      adharno:[''],
      cityname:[''],
      areaname:[''],
      pinno:[''],
        
    })
    // this.routes.paramMap.subscribe(parameter=>{
    //   let custid=parameter.get('customerid');
    //   let data=parseInt(custid);
    //   this.customerid=data;
    // })
    
  }
  saveaddress(){
  this.cs.postaddress(this.addressform.value).subscribe();
  this.router.navigate(['login/sales','bankdetail']);
  }
}
