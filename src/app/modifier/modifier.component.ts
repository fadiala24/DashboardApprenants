import { HttpBackend, HttpClient } from '@angular/common/http';
import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../services/service.service';
import { NavigationExtras } from '@angular/router';
@Component({
  selector: 'app-modifier',
  templateUrl: './modifier.component.html',
  styleUrls: ['./modifier.component.css']
})
export class ModifierComponent implements OnInit {
  items:any;
  constructor(
    private services3: ServiceService, private router: Router){
    }

  ngOnInit(){
    this.getListUser()
  }
  delete(id:any){
    this.services3.delete(id).subscribe(data=>{
      console.log(data)
      this.getListUser()
    })
  }
  update(id:any){
    let navigValue: NavigationExtras = {queryParams: {appId: id}}

    this.router.navigate(['update'], navigValue)
  }
  getListUser(){
    this.services3.listUtilisateur().subscribe((res:any)=>{
      this.items=res,
      console.log(res)
    })
  }
}
