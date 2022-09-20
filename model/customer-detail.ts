import { Address } from "./address"
import { BankDetails } from "./bank-details"
import { Document } from "./document"

    export class CustomerDetail 
    {customerid:number
    fullname:string
    mobileno:number
    age:number
    gender:string
    dob:string

    addr:Address
    bank:BankDetails
    document:Document
     
}
