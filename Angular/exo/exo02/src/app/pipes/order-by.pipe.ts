import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  standalone: true,
  name: 'orderBy'
})
export class OrderByPipe implements PipeTransform {
  transform(array: any[], order: string): any[] {
    if (!array || array.length === 0) return [];
    if (order === 'asc') {
      return array.sort((a, b) => a.name.localeCompare(b.name));
    } else if (order === 'desc') {
      return array.sort((a, b) => b.name.localeCompare(a.name));
    }
    return array;
  }
}
