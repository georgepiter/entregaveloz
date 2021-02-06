import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';

const url = URL
@Injectable({
  providedIn: 'root'
})
export class VelozService {  
    
  constructor(private http: HttpClient) { }

  getEncomendaRastreio(codigo: string): Observable<any> {
    return this.http.get(`${url}/pedido/${codigo}`);
  }

}
