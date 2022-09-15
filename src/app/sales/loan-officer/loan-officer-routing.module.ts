import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApprovedlistComponent } from '../approvedlist/approvedlist.component';
import { EmicalculatorComponent } from '../emicalculator/emicalculator.component';
import { EnquiryFormComponent } from '../enquiry-form/enquiry-form.component';
import { RejectlistComponent } from '../rejectlist/rejectlist.component';
import { LoanOfficerComponent } from './loan-officer.component';

const routes: Routes = [
  {
    path:'',component:LoanOfficerComponent,
    children:[
      {
        path:'enquiry',component:EnquiryFormComponent
      },
      {
        path:'emi',component:EmicalculatorComponent
      },
      {
        path:'approvedlist',component:ApprovedlistComponent
      },
      {
        path:'rejectlist',component:RejectlistComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LoanOfficerRoutingModule { }
