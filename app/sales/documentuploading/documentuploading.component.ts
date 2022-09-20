import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms'; 
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';
import { CustomerDetailService } from 'src/app/common/customer-detail.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-documentuploading',
  templateUrl: './documentuploading.component.html',
  styleUrls: ['./documentuploading.component.css']
})
export class DocumentuploadingComponent implements OnInit {
  formDoc:FormGroup;
  retriveDoc:any;
  selectphoto1:any;
  selectphoto2:any;
  selectphoto3:any;
  selectphoto4:any;
  selectphoto5:any;
  selectphoto6:any;
  selectphoto7:any;
  selectsignature:any;
  imageSrc1:any;
  imageSrc2:any;
  imageSrc3:any;
  imageSrc4:any;
  imageSrc5:any;
  imageSrc6:any;
  imageSrc7:any;
  reader=new FileReader();
  constructor(private fb:FormBuilder,private cs:CustomerDetailService,private router:Router) { }

msg:string
  ngOnInit(): void {
    this.formDoc=this.fb.group({
      photo:['',[Validators.required]],
      signature:['',[Validators.required]],
      electricbill:['',[Validators.required]],
      adharcard:['',[Validators.required]],
      pancard:['',[Validators.required]],
      propertydocument:['',[Validators.required]],
      bankpassbook:['',[Validators.required]]
    })



  }
  onselectphoto1(event){

    this.selectphoto1  =event.target.files[0];
   
    this.reader.onload = e => this.imageSrc1 = this.reader.result;
       this.reader.readAsDataURL(this.selectphoto1);
    }
    onselectphoto2(event){
      this.selectphoto2  =event.target.files[0];
     
      this.reader.onload = e => this.imageSrc2 = this.reader.result;
         this.reader.readAsDataURL(this.selectphoto2);
      }
      onselectphoto3(event){
        this.selectphoto3  =event.target.files[0];
       
        this.reader.onload = e => this.imageSrc3 = this.reader.result;
           this.reader.readAsDataURL(this.selectphoto3);
        }
        onselectphoto4(event){
          this.selectphoto4  =event.target.files[0];
         
          this.reader.onload = e => this.imageSrc4= this.reader.result;
             this.reader.readAsDataURL(this.selectphoto4);
          }
          onselectphoto5(event){
            this.selectphoto5  =event.target.files[0];
           
            this.reader.onload = e => this.imageSrc5 = this.reader.result;
               this.reader.readAsDataURL(this.selectphoto5);
            }
            onselectphoto6(event){
              this.selectphoto6  =event.target.files[0];
             
              this.reader.onload = e => this.imageSrc6 = this.reader.result;
                 this.reader.readAsDataURL(this.selectphoto6);
              }
              onselectphoto7(event){
                this.selectphoto7  =event.target.files[0];
               
                this.reader.onload = e => this.imageSrc7 = this.reader.result;
                   this.reader.readAsDataURL(this.selectphoto7);
                }

                saveDoc(){
                  
                  const doc=JSON.stringify(this.formDoc.value);
                    // create object of formData
                    const docupload=new FormData;
                    docupload.append("photo",this.selectphoto1);
                    docupload.append("pancard",this.selectphoto2);
                    docupload.append("electricbill",this.selectphoto3);
                    docupload.append("adharcard",this.selectphoto4);
                    docupload.append("signature",this.selectphoto5);
                    docupload.append("propertydocument",this.selectphoto6);
                    docupload.append("bankpassbook",this.selectphoto7);
                  
                    
                    
                    docupload.append("docid",doc);
                    alert("in ts")
                  this.cs.savedocument(docupload).subscribe();
                    this.msg="Form Submit Succesfully..!!"
                 }
                 getDocument(){
                  // this.cs.getDocss().subscribe(d=>{
                  // this.retriveDoc=d;
                   // })


}
generatePdf(){
  
// alert("In pdf generation")
  var data:any= document.getElementById("htmldata")
  html2canvas(data).then((canvas) => {
  let fileWidth = 208;
  let fileHeight = (canvas.height * fileWidth) / canvas.width;
  const FILEURI = canvas.toDataURL('image/png');
  let PDF = new jsPDF('p', 'mm', 'a4');
  let position = 0;
  PDF.addImage(FILEURI, 'PNG', 0, position, fileWidth, fileHeight);
  PDF.save('angular-demo.pdf');
  
})
}
}
