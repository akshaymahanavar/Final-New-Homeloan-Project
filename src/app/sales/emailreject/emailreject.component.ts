import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RejectemailService } from 'src/app/common/rejectemail.service';
import { Cibil } from 'src/app/model/cibil';

@Component({
  selector: 'app-emailreject',
  templateUrl: './emailreject.component.html',
  styleUrls: ['./emailreject.component.css']
})
export class EmailrejectComponent implements OnInit {

  constructor(private fb:FormBuilder,private re:RejectemailService,private location:Location) { }

  emailform:FormGroup
  mails:any
  ngOnInit(): void {
    
this.emailform=this.fb.group({
  toEmail:[''],
  subject:[''],
  textBody:['']
})
    // let mailid=this.location.getState();
    // this.mails=mailid;
  }
  emailsend(){
    alert("val"+this.emailform.get('toemail').value);

    this.re.postmail(this.emailform.value).subscribe();
  }
}
