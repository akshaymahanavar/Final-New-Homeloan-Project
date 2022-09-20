import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CreditmanagerRoutingModule } from './creditmanager-routing.module';
import { CreditmanagerComponent } from './creditmanager.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatButtonModule } from '@angular/material/button';
import { MatMenuModule } from '@angular/material/menu';
import { MatDividerModule } from '@angular/material/divider';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    CreditmanagerComponent
  ],
  imports: [
    CommonModule,
    CreditmanagerRoutingModule,
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

  ]
})
export class CreditmanagerModule { }
