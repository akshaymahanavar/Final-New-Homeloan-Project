import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Address } from '../model/address';

@Injectable({
  providedIn: 'root'
})
export class AddressService {
 
  constructor(private http:HttpClient) { }
 
}
