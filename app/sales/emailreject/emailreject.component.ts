import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { emailService } from 'src/app/common/email.service';


@Component({
  selector: 'app-emailreject',
  templateUrl: './emailreject.component.html',
  styleUrls: ['./emailreject.component.css']
})
export class EmailrejectComponent implements OnInit {

  constructor(private fb:FormBuilder,private re:emailService,private location:Location) { }

  emailform:FormGroup
  ngOnInit(): void {
    
this.emailform=this.fb.group({
  toEmail:[''],
  subject:['Regarding Loan Rejection'],
  textBody:['Dear sir,Sorry for the inconvienice you are not eligible for loan, due to cibil score less..']
})
    let mailobj:any=this.location.getState();

  if(mailobj!=null)
  {
    this.emailform.get(['toEmail']).setValue(mailobj.email);
  }  
  }
  emailsend(){

    this.re.postmail(this.emailform.value).subscribe();
  }
}
