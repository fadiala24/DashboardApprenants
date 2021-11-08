import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../services/service.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Identifiers } from '@angular/compiler/src/render3/r3_identifiers';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent implements OnInit {
  options: FormGroup;
  postBody: any
  items:any;
  itemss: any;
  constructor(private updateuser: ServiceService, private formB: FormBuilder, private http: HttpClient, private activedRouted: ActivatedRoute) {
    this.activedRouted.queryParams.subscribe(
      result=>{
        this.info(result.appId)
        this.items=result

      })


    this.options=this.formB.group({
      nom:['', Validators.required],
      prenom:['', Validators.required],
      genre:['', Validators.required],
      age:['', Validators.required],
      telephone:['', Validators.required],
      email:['', Validators.required],
      profil:['', Validators.required],
    })
   }

  ngOnInit(){
  }
  info(id:any){
    this.updateuser.info(id).subscribe((res:any)=>{
      this.itemss=res,
      console.log(res)
    })
  }
  ajout(){
    this.postBody={
      "nom":""+this.options.value.nom,
      "prenom":""+this.options.value.prenom,
      "genre":""+this.options.value.genre,
      "age":""+this.options.value.age,
      "telephone":""+this.options.value.telephone,
      "email":""+this.options.value.email,
      "profil":""+this.options.value.profil,
    }
    this.http.post("this.API+'/updateUser/'+id, user", this.postBody).subscribe()
    this.options.reset()
  }

}
