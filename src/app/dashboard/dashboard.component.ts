import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../services/service.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  items:any;
  constructor(private services1: ServiceService, private formB: FormBuilder, private http: HttpClient) { }

  ngOnInit(){
    this.services1.listApprenant().subscribe((data:any)=>{
      this.items=data,
      console.log(data)
    })
  }
}
