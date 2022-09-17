import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { CibilService } from 'src/app/common/cibil.service';
import { CommonService } from 'src/app/common/common.service';

@Component({
  selector: 'app-cibilscore',
  templateUrl: './cibilscore.component.html',
  styleUrls: ['./cibilscore.component.css']
})
export class CibilscoreComponent implements OnInit {
[x: string]: any;
enqobj: any;
  constructor(private location:Location,private cs:CibilService) { }
  
  ngOnInit(): void {
    
   let enqobj=this.location.getState();
  }
  
  cibil:any
  getcibil(){
    this.cs.getcibil().subscribe(data=>{
      this.cibil=data})
  }
}
