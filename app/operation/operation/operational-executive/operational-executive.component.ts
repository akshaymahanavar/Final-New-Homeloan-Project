import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-operational-executive',
  templateUrl: './operational-executive.component.html',
  styleUrls: ['./operational-executive.component.css']
})
export class OperationalExecutiveComponent implements OnInit 
{
  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  abc(){
    this.router.navigate(['login/operation','checklist']);
      }

}
