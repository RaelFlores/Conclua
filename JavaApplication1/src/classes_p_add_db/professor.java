package classes_p_add_db;

public class professor {
    private String nome;
    private int matricula;
    private String celular;
    private String email;
    private String area;
    private String sub_area;
    private int disponibilidade;
    private String formacao;
    
//------------------------------------------------
    
public String getnome(){
    return nome;
}
public int getmatricula(){
    return matricula;
}
public String getcelulcar(){
    return celular;
}
public String getemail(){
    return email;
}
public String getarea(){
    return area;
}
public String getsub_area(){
    return sub_area;
}
public int getdisponibilidade(){
    return disponibilidade;
}
public String getformacao(){
    return formacao;
}

//------------------------------------------------------

public void setnome(String nome){
    this.nome=nome;
}
public void setmatricula(int matricula){
    this.matricula=matricula;
}
public void setcelular(String celular){
    this.celular=celular;
}
public void setemail(String email){
    this.email=email;
}
public void setarea(String area){
    this.area=area;
}
public void setsub_area(String sub_area){
    this.sub_area=sub_area;
}
public void setdisponibilidade(int disponibilidade){
    this.disponibilidade=disponibilidade;
}
public void setformacao(String formacao){
    this.formacao=formacao;
}
    
}
