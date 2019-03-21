import { Component } from '@angular/core';
import { preserveWhitespacesDefault } from '@angular/compiler';

/**
 * Decorator
 */
@Component({
    //Selector should be unique
    selector: 'app-server',
    templateUrl: './server.component.html',
    styles:  [`
        .online {
            color : white;
        }`
    ]
})
export class ServerComponent {
    //Explict assign
    serverId: number= 10;
    serverStatus: string = 'offline';

    constructor(){
        this.serverStatus = Math.random() > 0.5 ? 'online' : 'offline';
    }

    getServerStatus(){
        return this.serverStatus;
    }

    getColor(){
        return this.serverStatus == 'online' ? 'green' : 'red';
    }
}

