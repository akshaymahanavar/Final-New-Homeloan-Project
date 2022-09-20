import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreditmanagerComponent } from './creditmanager.component';

const routes: Routes = [
  {
  path:'',component:CreditmanagerComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CreditmanagerRoutingModule { }
