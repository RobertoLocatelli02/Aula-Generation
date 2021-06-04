import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Categoria } from '../model/Categoria';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

  constructor(private http: HttpClient) { }
  
  token = {
    headers: new HttpHeaders().set('Authorization', environment.token)
  }

  getAllCategoria(): Observable<Categoria[]> {
    return this.http.get<Categoria[]>('https://projetoblogpessoalcatalogo.herokuapp.com/tema', this.token)
  }

  getByIdTema(id: number): Observable<Categoria> {
    return this.http.get<Categoria>(`https://projetoblogpessoalcatalogo.herokuapp.com/tema/${id}`, this.token)
  }

  postTema(tema: Categoria): Observable<Categoria> {
    return this.http.post<Categoria>('https://projetoblogpessoalcatalogo.herokuapp.com/tema', tema, this.token)
  }

  putTema(tema: Categoria): Observable<Categoria> {
    return this.http.put<Categoria>('https://projetoblogpessoalcatalogo.herokuapp.com/tema', tema, this.token)
  }

  deleteTema(id: number) {
    return this.http.delete(`https://projetoblogpessoalcatalogo.herokuapp.com/tema/${id}`, this.token)
  }
}
