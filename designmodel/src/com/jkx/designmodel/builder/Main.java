package com.jkx.designmodel.builder;

public class Main {
  public static void main(String[] args) {
  if(args.length != 1){
	  usage();
	  System.exit(0);
  }
  
  String arg = args[0];
  if("plain".equals(arg)){
	  TextBuilder builder = new TextBuilder(); 
	 Director director = new Director(builder); 
	 director.construct();
	 String result = builder.getResult();
	 System.out.println(result);
  }else if("html".equals(arg)){
	  HTMLBuilder builder = new HTMLBuilder();
	  Director director = new Director(builder);
	  director.construct();
	  String result = builder.getResult();
	  System.out.println(result + "制作完成");
  }else{
	  usage();
	  System.exit(0);
  }
}
  
  public static void usage(){
	  System.out.println("Usage: java main plain  编写纯文本文档");
	  System.out.println("Usage: java main html  编写HTML文档");
  }
}
