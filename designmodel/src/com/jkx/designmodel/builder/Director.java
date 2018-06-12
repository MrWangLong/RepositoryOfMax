package com.jkx.designmodel.builder;

public class Director {
	
	// Builder类实例
	private Builder builder;
	
	// 构造方法
	public Director(Builder builder) {
		
		this.builder = builder;
	}

	// 编写文档
	public void construct(){
		builder.makeTitle("时事政治");
		builder.makeContent("特朗普在记者会上首先感谢东道主新加坡，尤其是新加坡总理李显龙。他称与朝鲜的峰会是一次“史无前例的会面”。他说，这证明真正的改变是可能的。他说，“会晤是坦诚、直接和富有成效的。我们准备开始一段新的历史，我们两国之间的新篇章。”他表示：“我们签署了一份联合文件，这是对朝鲜完全无核化的坚定承诺。”");
		builder.makeItems(new String[]{
				"Tomcat总书记参加访美",
				"Jetty总统下台",
				"Weblogic首相鼓励生育"
		});
		builder.close();
	}
}
