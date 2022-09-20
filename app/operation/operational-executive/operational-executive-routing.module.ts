import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChecklistComponent } from '../checklist/checklist.component';
import { CibilscoreComponent } from '../cibilscore/cibilscore.component';
import { CustomerlistComponent } from '../customerlist/customerlist.component';
import { DocumentverificationComponent } from '../documentverification/documentverification.component';
import { OperationalExecutiveComponent } from './operational-executive.component';

const routes: Routes = [
  {
  path:'',component:OperationalExecutiveComponent,
  children:
  [
    {
path:'enquirylist',component:ChecklistComponent,children:
[
    {
      path:'cibilcheck',component:CibilscoreComponent
    }
]},


{
  path:'customerlist',component:CustomerlistComponent
},
{
  path:'documentverification',component:DocumentverificationComponent
}
  ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OperationalExecutiveRoutingModule { }
