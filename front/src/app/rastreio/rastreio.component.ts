import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router"

@Component({
  selector: 'app-rastreio',
  templateUrl: './rastreio.component.html',
  styleUrls: ['./rastreio.component.css']
})
export class RastreioComponent implements OnInit {

  public codigo: string;

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  rastrear() {
    this.router.navigate(['encomenda', this.codigo]);
  }

}
