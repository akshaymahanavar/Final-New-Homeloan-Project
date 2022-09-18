import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder } from '@angular/forms';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-adddocument',
  templateUrl: './adddocument.component.html',
  styleUrls: ['./adddocument.component.css']
})
export class AdddocumentComponent implements OnInit {
  formDoc: FormGroup ;
  retriveDoc:any; 
  selectphoto:any;
  selectadharcard:any;
  selectpancard:any;
  selectsign:any;



  constructor(private fb:FormBuilder,public cs:CommonService) {
    this.formDoc=this.fb.group({
      applicantName:[],
      docid:[]
      
    })
   }

  ngOnInit(): void {
  }
  onselectphoto(event){
    this.selectphoto=event.target.files[0];
  }
  onselectpancard(event){
    this.selectpancard=event.target.files[0];
  }
  onselectadharcard(event)
  {
    this.selectadharcard=event.target.files[0];
  }
  onselectsign(event){
    this.selectsign=event.target.files[0];
  }
  saveDoc()
  {
    const cust=JSON.stringify(this.formDoc.value);
    const docupload=new FormData();
    docupload.append("photo",this.selectphoto);
    docupload.append("adharcard",this.selectadharcard);
    docupload.append("pancard",this.selectpancard);
    docupload.append("sign",this.selectsign);
    docupload.append("doc",cust);

    this.cs.saveApplicant(docupload).subscribe();

    // window.location.reload();
  }
  getDocument()
  {
    this.cs.getDocs().subscribe(d=>{this.retriveDoc=d;});
    
  }

}
