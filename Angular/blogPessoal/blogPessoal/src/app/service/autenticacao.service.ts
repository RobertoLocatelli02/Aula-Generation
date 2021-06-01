
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserLogin } from '../model/UserLogin';
import { Usuario } from '../model/Usuario';

@Injectable({
  providedIn: 'root'
})
export class AutenticacaoService {

  constructor(private http: HttpClient) { }

  logar(userLogin : UserLogin): Observable<UserLogin> {
    return this.http.post<UserLogin>('https://projetoblogpessoalcatalogo.herokuapp.com/usuarios/logar', userLogin)
  }

  cadastrar(user : Usuario): Observable<Usuario> {
    return this.http.post<Usuario>('https://projetoblogpessoalcatalogo.herokuapp.com/usuarios/cadastrar', user)
  }
}
