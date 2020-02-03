package com.login;

public class LoginService {
public String validateLogin(String user,String pass) {
String result=null;
LoginDao loginDao=new LoginDao();
if(loginDao.validateUser(user, pass))
{
result="success";
return result;
}
else
result="failure" ;
return result;
}

}