import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


const API_URL = URL
@Injectable({
  providedIn: 'root'
})
export class VelozService {  
    
  constructor(private http: HttpClient) { }

  getEncomendaRastreio(codigo: string): Observable<any> {
    return this.http.get(`${API_URL}/pedido/${codigo}`);
  }

}
