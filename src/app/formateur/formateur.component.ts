import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../services/service.service';
@Component({
  selector: 'app-formateur',
  templateUrl: './formateur.component.html',
  styleUrls: ['./formateur.component.css']
})
export class FormateurComponent implements OnInit {
  items:any;
  constructor(private services5: ServiceService) { }

  ngOnInit(){
    this.services5.lisFormateur().subscribe((data:any)=>{
      this.items=data,
      console.log(data)
    })
  }

}
