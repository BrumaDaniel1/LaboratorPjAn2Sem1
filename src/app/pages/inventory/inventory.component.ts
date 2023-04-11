import { Component, OnInit } from '@angular/core';
import { FormComponent } from '../form/form.component';
import { MatDialog } from '@angular/material/dialog';
import { Item } from 'src/models/item';
import { ItemService } from 'src/app/services/item.service';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.scss']
})
export class InventoryComponent implements OnInit {
  items: String[] = [
    'Radu',
    'Maia',
    'Auras','Auras','Mada','Auras'
  ];
 
  itemsList!: Item[];
  error?: string;
  constructor(public dialog: MatDialog,  public itemService: ItemService) { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  getItems(): void {
    this.itemService.getItems().subscribe((list: Item[]) => {
      this.itemsList = list;
    }, (err) => {
      this.error = err.error;
    })
  }

  async openDialog() {
    const dialogRef = this.dialog.open(FormComponent, {
      width: '250px',
      data: { items: this.items },
    });

    dialogRef.afterClosed().subscribe(() => {
      console.log('The dialog was closed');
    });

    // ngOnInit(): void {
    // }
  };
  
}
