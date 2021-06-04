import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Categoria } from 'src/app/model/Categoria';
import { TemaService } from 'src/app/service/tema.service';
import { environment } from 'src/environments/environment.prod';

@Component({
  selector: 'app-tema-edit',
  templateUrl: './tema-edit.component.html',
  styleUrls: ['./tema-edit.component.css']
})
export class TemaEditComponent implements OnInit {

  tema: Categoria = new Categoria

  constructor(private temaService: TemaService, private router: Router, private rout: ActivatedRoute) { }

  ngOnInit() {
    if(environment.token == ''){
      this.router.navigate(['/entrar'])
    }

    let id = this.rout.snapshot.params['id'] //nome do parametro na rota-module
    this.findByIdTema(id)
  }

  findByIdTema(id: number) {
    this.temaService.getByIdTema(id).subscribe((resp: Categoria) => {
      this.tema = resp
    })
  }

  atualizar() {
    this.temaService.putTema(this.tema).subscribe((resp: Categoria) => {
      this.tema = resp
      alert('Tema atualizado com sucesso')
      this.router.navigate(['/tema'])
    })
  }
}
