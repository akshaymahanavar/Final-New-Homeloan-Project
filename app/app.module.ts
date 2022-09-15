import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderModule } from './header/header/header.module';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ChecklistComponent } from './operation/checklist/checklist.component';
import { LoanOfficerModule } from './sales/loan-officer/loan-officer.module';
import { OperationalExecutiveModule } from './operation/operational-executive/operational-executive.module';
import { CommonService } from './common/common.service';
import { HttpClientModule } from '@angular/common/http';

console.log("app module works");

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    AppRoutingModule,
    HeaderModule,
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    // LoanOfficerModule,
    // OperationalExecutiveModule
  ],
  providers: [CommonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
