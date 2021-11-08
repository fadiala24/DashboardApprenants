import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FormateurComponent } from './formateur/formateur.component';
import { ModifierComponent } from './modifier/modifier.component';
import { NavbarComponent } from './navbar/navbar.component';
import { PresencejourComponent } from './presencejour/presencejour.component';
import { PresencemoisComponent } from './presencemois/presencemois.component';
import { PresenceperiodeComponent } from './presenceperiode/presenceperiode.component';
import { PresencesemaineComponent } from './presencesemaine/presencesemaine.component';
import { RegisterComponent } from './register/register.component';
import { SupprimerComponent } from './supprimer/supprimer.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';



const routes: Routes =[
  {path:'modifier', component: ModifierComponent},
  {path:'tableau', component: DashboardComponent},
  {path:'formateur', component: FormateurComponent},
  {path:'register', component: RegisterComponent},
  {path: 'supprimer', component: SupprimerComponent},
  {path: 'update', component: UpdateuserComponent},
  {path: 'jour', component: PresencejourComponent},
  {path: 'mois', component: PresencemoisComponent},
  {path: 'semaine', component: PresencesemaineComponent},
  {path: 'periode', component: PresenceperiodeComponent},
  {path:'', component: NavbarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
