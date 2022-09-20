import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerDetailService } from 'src/app/common/customer-detail.service';
import { CustomerDetail } from 'src/app/model/customer-detail';
import { emailService } from 'src/app/common/email.service';

@Component({
  selector: 'app-documentverification',
  templateUrl: './documentverification.component.html',
  styleUrls: ['./documentverification.component.css']
})
export class DocumentverificationComponent implements OnInit {

  constructor(private location:Location,private fb:FormBuilder,private cs:CustomerDetailService,private router:Router,private es:emailService) { }
d:any
msg:string
customerstatus:FormGroup
emailform:FormGroup
  ngOnInit(): void {
this.customerstatus=this.fb.group({
personalstatus:['',[Validators.required]],
addressstatus:['',[Validators.required]],
bankstatus:['',[Validators.required]],
documentstatus:['',[Validators.required]],
verificarion:['']
    })  


   let cutobj=this.location.getState();
   this.d=cutobj;

   this.emailform=this.fb.group({
    toEmail:[''],
    subject:['Regarding Document Verification Rejection'],
    textBody:['Thank you for taking the time to submit and application for our we are fighters ,Dear sir,Sorry for the inconvenience you are submitted documents not satisfied with our criteria,for more information contact visit our branch ,Thank you  visit again......!! , ']
  })
  
   
  }

  approveds(){
    alert("in ts")
    // alert("approved");
     this.msg="approved";
     this.customerstatus.get(['verificarion']).setValue(this.msg);
    // alert("check="+this.customerstatus.get(['verificarion']).value)
    this.cs.poststatus(this.customerstatus.value,this.d.customerid).subscribe();
    this.router.navigate(['/login/operation']);
  }
  newclick(d:any){
    // alert("reject")
     this.msg="reject";
     this.customerstatus.get(['verificarion']).setValue(this.msg);
    // alert("check="+this.customerstatus.get(['verificarion']).value)
    this.cs.poststatus(this.customerstatus.value,this.d.customerid).subscribe();
    this.emailform.get(['toEmail']).setValue(this.d.email);
    this.es.postmail(this.emailform.value).subscribe();
    alert("rejection mail sent ")
    this.router.navigate(['/login/operation']);
  }
}
