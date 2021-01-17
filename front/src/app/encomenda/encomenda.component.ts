import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { faShippingFast, faBoxes, faHandsHelping, faBan } from '@fortawesome/free-solid-svg-icons';
import { NgxSpinnerService } from 'ngx-spinner';
import Swal from 'sweetalert2/dist/sweetalert2.js';

import { Pedido } from '../model/pedido.model';
import { VelozService } from '../services/veloz.service';

@Component({
  selector: 'app-encomenda',
  templateUrl: './encomenda.component.html',
  styleUrls: ['./encomenda.component.css']
})
export class EncomendaComponent implements OnInit {

  public icons: any = [
    faBoxes,
    faShippingFast,
    faHandsHelping,
    faBan,
  ]

  private codigo: string;
  public pedido: Pedido;

  constructor(private velozService: VelozService, private router: Router, private route: ActivatedRoute, private spinner: NgxSpinnerService) { }

  ngOnInit(): void {
    this.codigo = this.route.snapshot.paramMap.get('id');

    //buscar na api o pedido
    this.loadPedido();
    this.loadCliente();

  }

  loadPedido(): any {
    this.spinner.show();
    this.velozService.getEncomendaRastreio(this.codigo)
      .subscribe(
        data => {
          this.pedido = data;
          this.spinner.hide();
        },
        error => {
          Swal.fire('Não encontrado...', 'Digite o código de rastreio correto!', 'error')
          this.spinner.hide();
          this.router.navigate(['rastreio']);
        }
      );
  }
  loadCliente(): any {

  }
}
