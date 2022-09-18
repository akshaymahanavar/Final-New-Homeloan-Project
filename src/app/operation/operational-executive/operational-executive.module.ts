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
import { HttpClientModule } from '@angular/common/http';
import { ChecklistComponent } from '../checklist/checklist.component';
import { CibilscoreComponent } from '../cibilscore/cibilscore.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


console.log("operation module works");

@NgModule({
  declarations: [
    OperationalExecutiveComponent,
    ChecklistComponent,
    CibilscoreComponent
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
     MatDividerModule,
     HttpClientModule,
     ReactiveFormsModule,
     FormsModule
  ]
})
export class OperationalExecutiveModule { }
