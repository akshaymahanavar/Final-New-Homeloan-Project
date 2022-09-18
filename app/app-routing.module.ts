import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { headerroutes } from './header/header/header-routing.module';
import { HeaderComponent } from './header/header/header.component';

const routes: Routes = [
  {
    path:'',component:HeaderComponent,children:headerroutes
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
