import { Injectable } from '@angular/core';
impoprt { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }
  API= 'http://lacalhost:8080';

  public registerUtilisateur(utilisateur: any){
    return this.http.post(this.API+'/addUser', utilisateur);
  }
  plublic 
}
