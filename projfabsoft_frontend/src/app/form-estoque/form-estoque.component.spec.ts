import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormEstoqueComponent } from './form-estoque.component';

describe('FormEstoqueComponent', () => {
  let component: FormEstoqueComponent;
  let fixture: ComponentFixture<FormEstoqueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormEstoqueComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormEstoqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
