import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { DocumentuploadService } from 'src/app/common/documentupload.service';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';


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
  constructor(private fb:FormBuilder,private us:DocumentuploadService) { }

  ngOnInit(): void {
  }
  onselectphoto1(event){
    alert("call 2 photo");
    this.selectphoto2  =event.target.files[0];
   
    this.reader.onload = e => this.imageSrc1 = this.reader.result;
       this.reader.readAsDataURL(this.selectphoto1);
    }
    onselectphoto2(event){
      alert("call 2 photo");
      this.selectphoto2  =event.target.files[0];
     
      this.reader.onload = e => this.imageSrc2 = this.reader.result;
         this.reader.readAsDataURL(this.selectphoto2);
      }
      onselectphoto3(event){
        alert("call 2 photo");
        this.selectphoto2  =event.target.files[0];
       
        this.reader.onload = e => this.imageSrc3 = this.reader.result;
           this.reader.readAsDataURL(this.selectphoto3);
        }
        onselectphoto4(event){
          alert("call 2 photo");
          this.selectphoto2  =event.target.files[0];
         
          this.reader.onload = e => this.imageSrc4= this.reader.result;
             this.reader.readAsDataURL(this.selectphoto4);
          }
          onselectphoto5(event){
            alert("call 2 photo");
            this.selectphoto2  =event.target.files[0];
           
            this.reader.onload = e => this.imageSrc5 = this.reader.result;
               this.reader.readAsDataURL(this.selectphoto5);
            }
            onselectphoto6(event){
              alert("call 2 photo");
              this.selectphoto2  =event.target.files[0];
             
              this.reader.onload = e => this.imageSrc6 = this.reader.result;
                 this.reader.readAsDataURL(this.selectphoto6);
              }
              onselectphoto7(event){
                alert("call 2 photo");
                this.selectphoto2  =event.target.files[0];
               
                this.reader.onload = e => this.imageSrc7 = this.reader.result;
                   this.reader.readAsDataURL(this.selectphoto7);
                }

                saveDoc(){
                  const doc=JSON.stringify(this.formDoc.value);
                    // create object of formData
                    const docupload=new FormData();
                    docupload.append("photo",this.selectphoto1);
                    docupload.append("signature",this.selectphoto2);
                    docupload.append("electricitybill",this.selectphoto3);
                    docupload.append("adharcard",this.selectphoto4);
                    docupload.append("pancard",this.selectphoto5);
                    docupload.append("propertydocument",this.selectphoto6);
                    docupload.append("bankpassbook",this.selectphoto7);
                  
                    
                    
                    docupload.append("docid",doc);
                    // this.us.savedocuments(docupload).subscribe();
                  //  window.location.reload();
                 }
                 getDocument(){
                  // this.cs.getDocss().subscribe(d=>{
                  // this.retriveDoc=d;
                   // })


}
generatePdf(){
  alert("In pdf generation")
  var data:any= document.getElementById("htmldata")
  html2canvas(data).then((canvas) => {
  let fileWidth = 208;
  let fileHeight = (canvas.height * fileWidth) / canvas.width;
  const FILEURI = canvas.toDataURL('image/png');
  let PDF = new jsPDF('p', 'mm', 'a4');
  let position = 0;
  PDF.addImage(FILEURI, 'PNG', 0, position, fileWidth, fileHeight);
  PDF.save('angular-demo.pdf');
});
  
}
}
