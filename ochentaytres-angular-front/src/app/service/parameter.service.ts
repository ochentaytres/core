import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Parameter } from '../model/parameter';
import { Observable } from 'rxjs/Observable';
import { Routes } from '@angular/router';
import { ParameterFormComponent } from '../component/parameter-form/parameter-form.component';

@Injectable()
export class ParameterService {

  private baseUrl: string;

  constructor(private http: HttpClient) {

    this.baseUrl = 'http://192.168.1.133:8013/'
  }

  public findAll(): Observable<Parameter[]> {
    return this.http.get<Parameter[]>(this.baseUrl + 'rest/parameter/list');
  }

  public save(parameter: Parameter) {
    return this.http.post<Parameter>(this.baseUrl + 'rest/parameter/add', parameter);
  }

}
