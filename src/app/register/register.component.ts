import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ServiceService } from '../services/service.service';
import { HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  options: FormGroup;
  postBody: any

  constructor(private app: ServiceService, private formB: FormBuilder, private http: HttpClient) {
    this.options=this.formB.group({
      nom:['', Validators.required],
      prenom:['', Validators.required],
      genre:['', Validators.required],
      age:['', Validators.required],
      telephone:['', Validators.required],
      dateCreation:['', Validators.required],
      email:['', Validators.required],
      profil:['', Validators.required],
    })
  }
  ngOnInit(): void {
  }
  ajout(){
    this.postBody={
      "nom":""+this.options.value.nom,
      "prenom":""+this.options.value.prenom,
      "genre":""+this.options.value.genre,
      "age":""+this.options.value.age,
      "telephone":""+this.options.value.telephone,
      "dateCreation":""+this.options.value.dateCreation,
      "email":""+this.options.value.email,
      "profil":""+this.options.value.profil,
    }
    // console.log(this.postBody)
    this.http.post("http://localhost:8080/addUser", this.postBody).subscribe()
    this.options.reset()
  }
  }


