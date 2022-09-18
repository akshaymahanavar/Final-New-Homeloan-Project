import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loan-officer',
  templateUrl: './loan-officer.component.html',
  styleUrls: ['./loan-officer.component.css']
})
export class LoanOfficerComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  
}
