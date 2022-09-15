import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChecklistComponent } from '../checklist/checklist.component';
import { OperationalExecutiveComponent } from './operational-executive.component';

const routes: Routes = [
  {
  path:'',component:OperationalExecutiveComponent,
  children:[
    {
      path:'checklist',component:ChecklistComponent
    }
  ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OperationalExecutiveRoutingModule { }
