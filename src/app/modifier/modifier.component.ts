import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../services/service.service';
@Component({
  selector: 'app-modifier',
  templateUrl: './modifier.component.html',
  styleUrls: ['./modifier.component.css']
})
export class ModifierComponent implements OnInit {
  items:any;
  constructor(private services3: ServiceService) { }

  ngOnInit(){
    this.services3.listUtilisateur().subscribe((data:any)=>{
      this.items=data,
      console.log(data)
    })
  }

}
