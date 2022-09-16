import { Component, OnInit } from '@angular/core';
import { CommonService } from 'src/app/common/common.service';
import { EnquiryForm } from 'src/app/model/enquiry-form';

@Component({
  selector: 'app-checklist',
  templateUrl: './checklist.component.html',
  styleUrls: ['./checklist.component.css']
})
export class ChecklistComponent implements OnInit {

  constructor(private cs:CommonService){}
  enquiry:EnquiryForm[];
  ngOnInit(): void 
  {
    this.cs.getdata().subscribe(data =>{this.enquiry=data});
  }   

}
