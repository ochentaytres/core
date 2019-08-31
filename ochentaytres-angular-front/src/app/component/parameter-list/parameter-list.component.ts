import { Component, OnInit } from '@angular/core';
import { Parameter } from '../../model/parameter';
import { ParameterService } from '../../service/parameter.service';


@Component({
  selector: 'app-parameter-list',
  templateUrl: './parameter-list.component.html',
  styleUrls: ['./parameter-list.component.css']
})
export class ParameterListComponent implements OnInit {
  parameters: Parameter[];

  constructor(private parameterService: ParameterService) { }

  ngOnInit() {
    this.parameterService.findAll().subscribe(data => { this.parameters = data; });
  }

}
