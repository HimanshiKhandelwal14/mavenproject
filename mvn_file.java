package com.project;
public class App
{
  public int userlogin(String in_user , String in_pwd)
  {
    resourceBundle rb=ResourceBundle.getBundle("config");
    String userName=rb.getString("username");
    String password=rb.getString("password");
    
    if(in_user.equals(username) && in_pwd.equals(password))
      return1;
    else
      return0;
  }
  
}
