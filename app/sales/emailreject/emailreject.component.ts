import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RejectemailService } from 'src/app/common/rejectemail.service';
import { Cibil } from 'src/app/model/cibil';
import { EnquiryForm } from 'src/app/model/enquiry-form';

@Component({
  selector: 'app-emailreject',
  templateUrl: './emailreject.component.html',
  styleUrls: ['./emailreject.component.css']
})
export class EmailrejectComponent implements OnInit {

  constructor(private fb:FormBuilder,private re:RejectemailService,private location:Location) { }

  emailform:FormGroup
  ngOnInit(): void {
    
this.emailform=this.fb.group({
  toEmail:[''],
  subject:[''],
  textBody:['']
})
    let mailobj:any=this.location.getState();

  if(mailobj!=null)
  {
    this.emailform.get(['toEmail']).setValue(mailobj.email);
  }  
  }
  emailsend(){
    alert("val"+this.emailform.get('toemail').value);

    this.re.postmail(this.emailform.value).subscribe();
  }
}
