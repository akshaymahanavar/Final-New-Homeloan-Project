import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CibilService } from 'src/app/common/cibil.service';
import { Cibil } from 'src/app/model/cibil';
import { EnquiryForm } from 'src/app/model/enquiry-form';

@Component({
  selector: 'app-rejectlist',
  templateUrl: './rejectlist.component.html',
  styleUrls: ['./rejectlist.component.css']
})
export class RejectlistComponent implements OnInit {

  constructor(private cs:CibilService,private router:Router) { }

  enq:EnquiryForm[];
  ngOnInit(): void {

    {
      this.cs.getrejectdata().subscribe(data =>{this.enq=data});
    } 
  }

}
