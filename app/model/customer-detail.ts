import { Address } from "./address"
import { BankDetails } from "./bank-details"
import { Customerstatus } from "./customerstatus"
import { Document } from "./document"

    export class CustomerDetail 
    {customerid:number
    fullname:string
    mobileno:number
    age:number
    gender:string
    dob:string
    email:string
    addr:Address
    bank:BankDetails
    document:Document
    status:Customerstatus
     
}
