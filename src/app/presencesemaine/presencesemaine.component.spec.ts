import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PresencesemaineComponent } from './presencesemaine.component';

describe('PresencesemaineComponent', () => {
  let component: PresencesemaineComponent;
  let fixture: ComponentFixture<PresencesemaineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PresencesemaineComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PresencesemaineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
