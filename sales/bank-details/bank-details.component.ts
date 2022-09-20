import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerDetailService } from 'src/app/common/customer-detail.service';

@Component({
  selector: 'app-bank-details',
  templateUrl: './bank-details.component.html',
  styleUrls: ['./bank-details.component.css']
})
export class BankDetailsComponent implements OnInit {

  constructor(private fb:FormBuilder,private cs:CustomerDetailService,private router:Router) { }
  bankform:FormGroup
  ngOnInit(): void {
    this.bankform=this.fb.group({
      accountno:[''],
      ifsccode:[''],
      bankname:[''],
      branchcode:['']
    })

  }
  savebank()
  {
      this.cs.postbank(this.bankform.value).subscribe();
      this.router.navigate(['login/sales','docdetails']);
  }
}
