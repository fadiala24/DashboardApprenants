import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) {
   }
  API= 'http://localhost:8080';

  public registerUtilisateur(utilisateur: any){
    return this.http.post(this.API+'/addUser', utilisateur);
  }
  listUtilisateur(){
    return this.http.get(this.API+'/ListUser');
  }
  listApprenant(){
    return this.http.get(this.API+'/profile=apprenant')
  }
}
