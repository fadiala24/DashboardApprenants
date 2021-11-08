import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PresencemoisComponent } from './presencemois.component';

describe('PresencemoisComponent', () => {
  let component: PresencemoisComponent;
  let fixture: ComponentFixture<PresencemoisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PresencemoisComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PresencemoisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
