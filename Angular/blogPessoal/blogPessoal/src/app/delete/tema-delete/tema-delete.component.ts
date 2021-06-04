import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Categoria } from 'src/app/model/Categoria';
import { TemaService } from 'src/app/service/tema.service';
import { environment } from 'src/environments/environment.prod';

@Component({
  selector: 'app-tema-delete',
  templateUrl: './tema-delete.component.html',
  styleUrls: ['./tema-delete.component.css']
})
export class TemaDeleteComponent implements OnInit {

  tema: Categoria = new Categoria
  idTema: number

  constructor(private temaService: TemaService, private router: Router, private rout: ActivatedRoute) { }

  ngOnInit() {
    if(environment.token == '') {
      this.router.navigate(['/entrar'])
    }

    this.idTema = this.rout.snapshot.params['id']
    this.findByIdTema(this.idTema)
  }

  findByIdTema(id: number) {
    this.temaService.getByIdTema(id).subscribe((resp: Categoria) => {
      this.tema = resp
    })
  }

  apagar() {
    this.temaService.deleteTema(this.tema.id).subscribe(() => {
      alert('Tema apagado com sucesso')
      this.router.navigate(['/tema'])
    })
  }
}
