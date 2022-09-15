import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoanOfficerComponent } from 'src/app/sales/loan-officer/loan-officer.component';
import { AboutUsComponent } from '../about-us/about-us.component';
import { ContactUsComponent } from '../contact-us/contact-us.component';
import { HomeComponent } from '../home/home.component';
import { LoginComponent } from '../login/login.component';

export const headerroutes: Routes = [
  {
    path:'',redirectTo:'home',pathMatch:'full'
  },
  {
    path:'home',component:HomeComponent
  },
  {
    path:'about-us', component:AboutUsComponent
  },
  {
    path:'contact-us',component:ContactUsComponent
  },
  {
    path:'login',component:LoginComponent
  },
  {
    path:'login/sales',loadChildren:()=>import('src/app/sales/loan-officer/loan-officer.module').then(module=>module.LoanOfficerModule)
  },
  {
    path:'login/operation',loadChildren:()=>import('src/app/operation/operational-executive/operational-executive.module').then(module=>module.OperationalExecutiveModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(headerroutes)],
  exports: [RouterModule]
})
export class HeaderRoutingModule { }
