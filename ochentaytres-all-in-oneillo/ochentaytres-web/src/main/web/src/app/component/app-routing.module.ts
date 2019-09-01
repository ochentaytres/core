import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ParameterListComponent } from './parameter-list/parameter-list.component';
import { ParameterFormComponent } from './parameter-form/parameter-form.component';
const routes: Routes = [
  { path: ParameterListComponent.path, component: ParameterListComponent },
  { path: ParameterFormComponent.path, component: ParameterFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
