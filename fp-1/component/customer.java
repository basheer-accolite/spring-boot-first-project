package component;
import javax.persistence.Column;
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


@Entity  
//defining class name as Table name  
@Table  
public class customer  
{  
//Defining book id as primary key  
@Id  
@Column  
private int cid;
@Column
private int firstname;  
@Column  
private int lastname;
@Column
private String email;  
@Column  
private int pno;
@Column
private String address;  
@Column  
private int accountnumber;  
public String getName()   
{  
return "firstname"+"lastname";  
}  
public void setEmail(String email)   
{  
this.email = email;  
}  
public String getEmail()  
{  
return email;  
}  
public void setaddress(String address)   
{  
this.address = address;  
}  
public String getaddress()   
{  
return address;  
}  
public void setAccountNumber(int Accno)   
{  
this.accountnumber = Accno;  
}  
public int getAccountNumber()   
{  
return accountnumber;  
}  
public void setPno(int pno)   
{  
this.pno = pno;  
}  
public int getPno()
{
 return pno;
}
}  
