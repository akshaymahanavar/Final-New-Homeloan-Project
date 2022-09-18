import { Component, OnInit } from '@angular/core';
import { CibilService } from 'src/app/common/cibil.service';
import { Cibil } from 'src/app/model/cibil';
import { EnquiryForm } from 'src/app/model/enquiry-form';
@Component({
  selector: 'app-approvedlist',
  templateUrl: './approvedlist.component.html',
  styleUrls: ['./approvedlist.component.css']
})
export class ApprovedlistComponent implements OnInit 
{ 
  constructor(private cs:CibilService){}
  cibil:Cibil[];

  ngOnInit(): void 
  {
    this.cs.getchecklist().subscribe(data =>{this.cibil=data});
    
  }    
}
 