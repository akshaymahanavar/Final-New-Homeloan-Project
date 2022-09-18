import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApprovedlistComponent } from '../approvedlist/approvedlist.component';
import { CustomerDetailsComponent } from '../customer-details/customer-details.component';
import { EmailrejectComponent } from '../emailreject/emailreject.component';
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
        path:'rejectlist',component:RejectlistComponent,
        children:[
          {
            path:'rejectmail',component:EmailrejectComponent
          }
        ]
      },
      {
        path:'approved',component:ApprovedlistComponent
      },
      {
        path:'customerdetails',component:CustomerDetailsComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LoanOfficerRoutingModule { }
