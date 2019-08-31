import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Parameter } from '../model/parameter';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ParameterService {

  private parametersUrl: string;

  constructor(private http: HttpClient) {
    this.parametersUrl = 'http://192.168.1.133:8080/parameters'
  }

  public findAll(): Observable<Parameter[]> {
    return this.http.get<Parameter[]>(this.parametersUrl);
  }

  public save(parameter: Parameter) {
    return this.http.post<Parameter>(this.parametersUrl, parameter);
  }

}
