import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { CustomerDetail } from 'src/app/model/customer-detail';

@Component({
  selector: 'app-documentverification',
  templateUrl: './documentverification.component.html',
  styleUrls: ['./documentverification.component.css']
})
export class DocumentverificationComponent implements OnInit {

  constructor(private location:Location) { }
d:any
  ngOnInit(): void {
      
   let cutobj=this.location.getState();
   this.d=cutobj;
   
  }


}
