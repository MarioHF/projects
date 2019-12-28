import { Component, Output } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

 loadedFeature = 'recipe'
 title = 'course-project';

  onNavigate(feature: string){
    this.loadedFeature = feature
  }

  
}