import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent implements OnInit {

  title: String = 'test';
  tests;

  ngOnInit() {
    this.getHeartBeat();
    this.getAllTest();
  }


  getHeartBeat() {

    window.fetch('/heartbeat')
      .then((response) => {
        console.log(response);
        return response.text();
      })
      .then((myJson) => {
        console.log(this);
        this.title = myJson;

      }).catch(() => null);
  }

  getAllTest() {

    window.fetch('/test')
      .then((response) => {
        console.log(response)
        return response.json();
      })
      .then((myJson) => {
        console.log(this);
        this.tests = myJson;

      }).catch(() => null);
  }




}
