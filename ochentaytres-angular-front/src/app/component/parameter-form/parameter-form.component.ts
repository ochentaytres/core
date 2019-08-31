import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Parameter } from '../../model/parameter';
import { ParameterService } from '../../service/parameter.service';
import { ParameterListComponent } from '../parameter-list/parameter-list.component';

@Component({
  selector: 'app-parameter-form',
  templateUrl: './parameter-form.component.html',
  styleUrls: ['./parameter-form.component.css']
})
export class ParameterFormComponent {

  static path: string = 'rest/parameter/add';
  
  parameter: Parameter;

  constructor(private route: ActivatedRoute, private router: Router, private parameterService: ParameterService) {
    this.parameter = new Parameter();
  }

  onSubmit() {
    this.parameterService.save(this.parameter).subscribe(result => this.gotoParameterList());
  }
  gotoParameterList() {
    this.router.navigate([ParameterListComponent.path]);
  }
}
