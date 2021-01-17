import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EncomendaComponent } from './encomenda/encomenda.component';
import { RastreioComponent } from './rastreio/rastreio.component';

export const routes: Routes = [
    { path: '', component: RastreioComponent },
    { path: 'rastreio', component: RastreioComponent },
    { path: 'encomenda/:id', component: EncomendaComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }