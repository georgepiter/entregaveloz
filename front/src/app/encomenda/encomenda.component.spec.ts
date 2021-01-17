import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EncomendaComponent } from './encomenda.component';

describe('EncomendaComponent', () => {
  let component: EncomendaComponent;
  let fixture: ComponentFixture<EncomendaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EncomendaComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EncomendaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
