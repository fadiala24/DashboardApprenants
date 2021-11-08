import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PresenceperiodeComponent } from './presenceperiode.component';

describe('PresenceperiodeComponent', () => {
  let component: PresenceperiodeComponent;
  let fixture: ComponentFixture<PresenceperiodeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PresenceperiodeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PresenceperiodeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
