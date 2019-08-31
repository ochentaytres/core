import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ParameterListComponent } from './component/parameter-list/parameter-list.component';
import { ParameterFormComponent } from './component/parameter-form/parameter-form.component';
import { AppRoutingModule } from './component/app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ParameterService } from './service/parameter.service';


@NgModule({
  declarations: [
    AppComponent,
    ParameterListComponent,
    ParameterFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ParameterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
