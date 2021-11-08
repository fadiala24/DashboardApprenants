import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PresencejourComponent } from './presencejour.component';

describe('PresencejourComponent', () => {
  let component: PresencejourComponent;
  let fixture: ComponentFixture<PresencejourComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PresencejourComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PresencejourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
