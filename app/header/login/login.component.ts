import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private fb:FormBuilder,private router:Router) { }
  loginForm:FormGroup;
  ngOnInit(): void {
    this.loginForm=this.fb.group({
      userName:['',[Validators.required]],
      password:['',[Validators.required]]
    })
  }
  msg:string
  navigateTologin(){
    if(this.loginForm.get(['userName']).value==="admin" && this.loginForm.get(['password']).value==="admin"){
  //  this.router.navigate(['login/sales']);
  this.router.navigateByUrl("login/sales");
  }
  else{
  if(this.loginForm.get(['userName']).value==="oper" && this.loginForm.get(['password']).value==="oper"){
//    this.router.navigate(['login/operation']);
this.router.navigateByUrl("login/operation");
}
  else{
    this.msg="wrong userid!!!!";
    this.router.navigate(['login']);
  }
}
}
}
