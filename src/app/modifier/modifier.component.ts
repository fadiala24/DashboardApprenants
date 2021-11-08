import { HttpBackend, HttpClient } from '@angular/common/http';
import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../services/service.service';
@Component({
  selector: 'app-modifier',
  templateUrl: './modifier.component.html',
  styleUrls: ['./modifier.component.css']
})
export class ModifierComponent implements OnInit {
  items:any;
  constructor(
    private services3: ServiceService){
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
  getListUser(){
    this.services3.listUtilisateur().subscribe((res:any)=>{
      this.items=res,
      console.log(res)
    })
  }
}
