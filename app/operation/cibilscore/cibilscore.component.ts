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

  constructor(private location:Location,private cs:CibilService,private fb:FormBuilder) { }
  enqobj:any
  cibilform:FormGroup
  ngOnInit(): void {
    
   let enqobjs=this.location.getState();
this.enqobj=enqobjs;

this.cibilform=this.fb.group({
  cibilid:[''],
  cibilscore:[],
  cibilstatus:['']
})

}
  
  cibilscore:any

  getcibil(){
    this.cs.getcibil().subscribe(data=>{
      this.cibilscore=data,
      this.cibilform.get('cibilscore').setValue(data)
    })
  }

  savecibil(){
  console.log(this.cibilform.get('cibilscore').value);
  
    this.cs.postcibil(this.cibilform.value,this.enqobj.formno).subscribe();
  }
}
