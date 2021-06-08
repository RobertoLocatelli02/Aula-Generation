import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { Categoria } from '../model/Categoria';
import { Postagem } from '../model/Postagem';
import { Usuario } from '../model/Usuario';
import { PostagemService } from '../service/postagem.service';
import { TemaService } from '../service/tema.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  postagem: Postagem = new Postagem()

  categoria : Categoria = new Categoria()
  listaCategorias: Categoria[]
  idCategoria: number

  user: Usuario = new Usuario()
  idUser = environment.id

  constructor(private router: Router, private postagemService: PostagemService, private temaService: TemaService) { }

  ngOnInit() {
    if(environment.token == '') {
      this.router.navigate(['/entrar'])
    }

    this.getAllTemas()
  }

  getAllTemas() {
    this.temaService.getAllCategoria().subscribe((resp: Categoria[]) => {
      this.listaCategorias = resp
    })
  }

  findByIdTema() {
    this.temaService.getByIdTema(this.idCategoria).subscribe((resp: Categoria) => {
      this.categoria = resp
    })
  }

  publicar() {
    this.categoria.id = this.idCategoria
    //this.postagem.categoria = this.categoria

    this.user.id = this.idUser
    //this.postagem.usuario = this.user

    this.postagemService.postPostagem(this.postagem).subscribe((resp: Postagem) => {
      this.postagem = resp
      alert("Postagem realizada com sucesso")
      this.postagem = new Postagem()
    })
  }
}
