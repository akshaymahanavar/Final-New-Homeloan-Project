import { Component, OnInit } from '@angular/core';
import { EnquiryForm } from 'src/app/model/enquiry-form';
import { CommonService } from '../common/common.service';
@Component({
  selector: 'app-approvedlist',
  templateUrl: './approvedlist.component.html',
  styleUrls: ['./approvedlist.component.css']
})
export class ApprovedlistComponent implements OnInit 
{ 
  constructor(private cs:CommonService){}
  enquiry:EnquiryForm[];
  ngOnInit(): void 
  {
    this.cs.getdata().subscribe(data =>{this.enquiry=data});
  }    
}
