import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emicalculator',
  templateUrl: './emicalculator.component.html',
  styleUrls: ['./emicalculator.component.css']
})
export class EmicalculatorComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  public P:number;
  public R:number=8;
  public N:number;
  public up:number;
  public ipm:number;
  public down:number;
  public result:number;
  
 public totalintrest:number;
 public totalpayment:number;
   calculate()
   {
     this.ipm=this.R/12/100
  
   this.up=(this.P*this.ipm*Math.pow((1+this.ipm),this.N));
   this.down=(Math.pow((1+this.ipm),(this.N))-1);
  
 this.result=Math.round(this.up/this.down);
 this.totalintrest=Math.round((this.result*this.N)-this.P);
 this.totalpayment=Math.round(this.totalintrest+this.P)
   }

}
