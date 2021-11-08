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
    return this.http.get(this.API+'/profile=apprenant');
  }
  lisFormateur(){
    return this.http.get(this.API+'/profile=formateur');
  }
  update(id:any, userBody:any){
    return this.http.put(this.API+'/updateUser/'+id, userBody);
  }
  presencejour(){
    return this.http.get(this.API+'/presence');
  }
  presence(){
    return this.http.get(this.API+'/add_presence')
  }
  delete(id:any){
    return this.http.delete(this.API+'/deleteUser/'+id, {responseType: 'text'})
  }
  info(id:any){
    return this.http.get(this.API+'/InfoUser/'+id)
  }
}
