import { Component } from '@angular/core';

/**
 * Decorator
 */
@Component({
    //Selector should be unique
    selector: 'app-server',
    templateUrl: './server.component.html'
})
export class ServerComponent {
    //Explict assign
    serverId: number= 10;
    serverStatus: string = 'offline';

    getServerStatus(){
        return this.serverStatus;
    }
}

