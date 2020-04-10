import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent implements OnInit {

  title: String = 'test';

  ngOnInit() {
    this.getHeartBeat();
  }


  getHeartBeat() {

    window.fetch('/heartbeat')
      .then(function (response) {
        console.log(response)
        return response.text();
      })
      .then((myJson) => {
        console.log(this)
        this.title = myJson;
        
      }).catch(() => null);
  }




}
