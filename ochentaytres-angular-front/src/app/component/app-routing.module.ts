import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ParameterListComponent } from './parameter-list/parameter-list.component';
import { ParameterFormComponent } from './parameter-form/parameter-form.component';

const routes: Routes = [
  { path: 'parameters', component: ParameterListComponent },
  { path: 'addParameter', component: ParameterFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }