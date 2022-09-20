import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CibilService } from 'src/app/common/cibil.service';
import { emailService } from 'src/app/common/email.service';
import { Cibil } from 'src/app/model/cibil';
import { EnquiryForm } from 'src/app/model/enquiry-form';
@Component({
  selector: 'app-approvedlist',
  templateUrl: './approvedlist.component.html',
  styleUrls: ['./approvedlist.component.css']
})
export class ApprovedlistComponent implements OnInit 
{ 
  constructor(private cs:CibilService,private router:Router,private fb:FormBuilder,private email:emailService){}
  enq:EnquiryForm[];
  emailform:FormGroup
  abs:string
  ngOnInit(): void 
  {
    this.cs.getchecklist().subscribe(data =>{this.enq=data});
        
this.emailform=this.fb.group({
  toEmail:[''],
  subject:['Approve your Homeloan Applicationsss'],
  textBody:['We are informing you that our we are fighters bank approve your home loan application,following mention documents required so send this documents our wearefighters77@gmail.com: 1] Passport Size photo, 2] Adhar card, 3] Pan Card, 4] Electricity Bill, 5] Property Document, 6] Signature, 7] Bank Passbook']
})

  }    

  mailsend(e:any){
    alert("mail send succesfull");
    this.emailform.get(['toEmail']).setValue(e.email);
    this.email.postmail(this.emailform.value).subscribe();
  
  }
  navigatetocustomer(){
this.router.navigate(['login/sales','customerdetails']);
  }
}
 