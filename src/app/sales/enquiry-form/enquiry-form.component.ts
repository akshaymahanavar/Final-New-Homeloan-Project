import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CommonService } from 'src/app/common/common.service';

@Component({
  selector: 'app-enquiry-form',
  templateUrl: './enquiry-form.component.html',
  styleUrls: ['./enquiry-form.component.css']
})
export class EnquiryFormComponent implements OnInit {

  constructor(public fb:FormBuilder,private cs:CommonService) { }
  enquiryform:FormGroup;
  ngOnInit(): void {
    this.enquiryform=this.fb.group({

      formno:[''],
fullname:['', [Validators.required ,Validators.maxLength(10),Validators.minLength(5)]],
mobileno:['', [Validators.required,Validators.maxLength(10),Validators.minLength(10)]],
email:['', [Validators.required,Validators.email,Validators.maxLength(20)]],
age:['', [Validators.required,Validators.min(21)]],
gender:['', [Validators.required]]

})

  }
  onSubmit(){
    alert("callhere........................");
    console.log("fullname="+this.enquiryform.controls['fullname'].value);
  this.cs.postdata(this.enquiryform.value).subscribe();
   }

}
