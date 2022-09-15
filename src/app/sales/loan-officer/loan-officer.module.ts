import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoanOfficerRoutingModule } from './loan-officer-routing.module';
import { LoanOfficerComponent } from './loan-officer.component';
import { EmicalculatorComponent } from '../emicalculator/emicalculator.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import {MatButtonModule} from '@angular/material/button';
import {MatMenuModule} from '@angular/material/menu';
import {MatDividerModule} from '@angular/material/divider';
import { ApprovedlistComponent } from '../approvedlist/approvedlist.component';
import { EnquiryFormComponent } from '../enquiry-form/enquiry-form.component';
import { RejectlistComponent } from '../rejectlist/rejectlist.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonService } from 'src/app/common/common.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';

console.log("loanofficer module works");

@NgModule({
  declarations: [
    LoanOfficerComponent,
    EmicalculatorComponent, 
    EnquiryFormComponent,
    ApprovedlistComponent,
    RejectlistComponent
  ],
  imports: [
    CommonModule,
    LoanOfficerRoutingModule,
     //material imports
     MatToolbarModule,
     MatSidenavModule,
     MatIconModule,
     MatListModule,
     MatButtonModule,
     MatMenuModule,
     MatDividerModule,
     ReactiveFormsModule,
     FormsModule,
     HttpClientModule
 
  ],
  
  providers: [CommonService],
})
export class LoanOfficerModule { }
