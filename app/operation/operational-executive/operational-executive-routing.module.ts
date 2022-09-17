import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChecklistComponent } from '../checklist/checklist.component';
import { CibilscoreComponent } from '../cibilscore/cibilscore.component';
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
]}
  ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OperationalExecutiveRoutingModule { }
