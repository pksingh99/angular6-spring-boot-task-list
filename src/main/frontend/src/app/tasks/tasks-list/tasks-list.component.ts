import { Component, OnInit } from '@angular/core';

import { Task } from '../task.model';
import {TaskService} from "../task.service";
import {forEach} from "@angular/router/src/utils/collection";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

    constructor(
        private taskService: TaskService
    ) { }

    ngOnInit() {
        return this.taskService.getTasks()
            .subscribe(
                (tasks: any[]) => {
                    this.tasks = tasks;
                },
                (error) => console.log(error)
            );
    }

    getDueDateBadge(task: Task) {
        return task.completed ? 'badge-success' : 'badge-primary';
    }

    onTaskChange(event, task) {
        console.log('Task has changed.');
    }

}
