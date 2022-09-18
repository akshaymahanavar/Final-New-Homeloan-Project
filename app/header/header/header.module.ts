import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HeaderRoutingModule } from './header-routing.module';
import { HeaderComponent } from './header.component';

import { ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from '../home/home.component';
import { AboutUsComponent } from '../about-us/about-us.component';
import { ContactUsComponent } from '../contact-us/contact-us.component';
import { LoginComponent } from '../login/login.component';
import { LoanOfficerModule } from 'src/app/sales/loan-officer/loan-officer.module';
import { OperationalExecutiveModule } from 'src/app/operation/operational-executive/operational-executive.module';

console.log("header module works");

@NgModule({
  declarations: [
    HeaderComponent,
    HomeComponent,
    AboutUsComponent,
    ContactUsComponent,
    LoginComponent
  ],
  imports: [
    CommonModule,
    HeaderRoutingModule,
    ReactiveFormsModule,
    // LoanOfficerModule,
    // OperationalExecutiveModule
  ]
})
export class HeaderModule { }
