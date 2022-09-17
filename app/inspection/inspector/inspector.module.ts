import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InspectorRoutingModule } from './inspector-routing.module';
import { InspectorComponent } from '../inspector/inspector.component';
import { ApprovedlistComponent } from '../approvedlist/approvedlist.component';
import { HttpClientModule } from '@angular/common/http';
import { MatButtonModule } from '@angular/material/button';
import { MatDividerModule } from '@angular/material/divider';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';


@NgModule({
  declarations: [
    InspectorComponent,
    ApprovedlistComponent
  ],
  imports: [
    CommonModule,
    InspectorRoutingModule,
    MatToolbarModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatButtonModule,
    MatMenuModule,
    MatDividerModule,
    HttpClientModule
  ]
})
export class InspectorModule { }
