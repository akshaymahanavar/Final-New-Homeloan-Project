import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApprovedlistComponent } from '../approvedlist/approvedlist.component';
import { InspectorComponent } from './inspector.component';

const routes: Routes = [
  {
    path:'',component: InspectorComponent
  },
  {
    path:'approvedbyinspector',component:ApprovedlistComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InspectorRoutingModule { }
