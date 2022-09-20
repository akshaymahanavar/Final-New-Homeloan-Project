import { Component, OnInit } from '@angular/core';
import { CustomerDetailService } from 'src/app/common/customer-detail.service';
import { CustomerDetail } from 'src/app/model/customer-detail';

@Component({
  selector: 'app-customerlist',
  templateUrl: './customerlist.component.html',
  styleUrls: ['./customerlist.component.css']
})
export class CustomerlistComponent implements OnInit {

  constructor(private cs:CustomerDetailService) { }
  customer:CustomerDetail[]
  ngOnInit(): void {
    this.cs.getcustomer().subscribe(data=>{
      this.customer=data
    })
  }

}
