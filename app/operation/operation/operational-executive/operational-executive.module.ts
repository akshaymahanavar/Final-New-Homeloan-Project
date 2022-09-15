import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OperationalExecutiveRoutingModule } from './operational-executive-routing.module';
import { OperationalExecutiveComponent } from './operational-executive.component';

console.log("operation module works");

@NgModule({
  declarations: [
    OperationalExecutiveComponent
  ],
  imports: [
    CommonModule,
    OperationalExecutiveRoutingModule
  ]
})
export class OperationalExecutiveModule { }
