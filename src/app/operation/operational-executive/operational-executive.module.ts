import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OperationalExecutiveRoutingModule } from './operational-executive-routing.module';
import { OperationalExecutiveComponent } from './operational-executive.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import {MatButtonModule} from '@angular/material/button';
import {MatMenuModule} from '@angular/material/menu';
import {MatDividerModule} from '@angular/material/divider';


console.log("operation module works");

@NgModule({
  declarations: [
    OperationalExecutiveComponent
  ],
  imports: [
    CommonModule,
    OperationalExecutiveRoutingModule,
     //material imports
     MatToolbarModule,
     MatSidenavModule,
     MatIconModule,
     MatListModule,
     MatButtonModule,
     MatMenuModule,
     MatDividerModule
  ]
})
export class OperationalExecutiveModule { }
