import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../services/service.service';
@Component({
  selector: 'app-presencejour',
  templateUrl: './presencejour.component.html',
  styleUrls: ['./presencejour.component.css']
})
export class PresencejourComponent implements OnInit {
  items:any;
  constructor(private services1: ServiceService) { }

  ngOnInit(){
    this.services1.presencejour().subscribe((data:any)=>{
      this.items=data,
      console.log(data)
    })
  }

}
