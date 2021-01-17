import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RastreioComponent } from './rastreio.component';

describe('RastreioComponent', () => {
  let component: RastreioComponent;
  let fixture: ComponentFixture<RastreioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RastreioComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RastreioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
