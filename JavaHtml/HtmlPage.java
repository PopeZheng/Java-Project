package OriginalPlace;
import java.io.*;
public class HtmlPage
{
	 String pageTitle;
	 String pageBody;
	 String bgImage;
	 String bgColor;
	 
	 HtmlPage()
	 {
		 pageTitle="";
		 pageBody="";
		 bgColor="";
		 bgImage="";
	 }
	 
	String getHeader()
	 {
		 return ("<html> <head> <title>"+pageTitle+"</title> </head>");
	 }
	String getFooter()
	{
		return ("</html>");
	}
	
	void setTitle(String titlename)
	{
		pageTitle=titlename;
	}
	
	void setBgimage (String imageName)
	{
		bgImage=imageName;
	}
	
	void setBgcolor(String colorname)
	{
		bgColor=colorname;
	}
	
	String getBody()
	{
		return ("<body bgcolor="+bgColor+" bgimage="+bgImage+">"
				+pageBody+"</body>");
	}
	String getDoctype()
	{
		return("<!doctype html>");
	}
	void addText(String addtext)
	{
		pageBody=pageBody+addtext;
	}
	String buildHtml()
	{
		String htmlall;
		htmlall=getDoctype() + getHeader() + getBody() + getFooter();
		return htmlall;
	}
}
