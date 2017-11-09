package com.cjs.rename;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author liuyw
 * 
 * 需求:华为厂商日志文件批量重命名 实现：新建初始化目录dir1存放原日志文件，新建dir2目录存放重命名后的文件，
 *     重命名后原文件将在dir1目录中删除，重命名后的新文件在dir2目录中查看。
 */
public class ReadLine {

	public static void main(String[] args) {
		// 计数器
		int num = 1;
		// 初始化文件
		File file = null;
		// 存放初始化文件的目录（注意不同系统目录格式的差异）
		File dir = new File("./oldFile");		
		//判断初始化文件目录是否为空
		if(dir.listFiles().length<=0)
			System.out.println("温馨提示:oldFile目录是否已经存放文件？");		
		//迭代目录所有文件
		for (File temp : dir.listFiles()) {
			//游标(判断文本是否停止读取，所有文本一旦获关键值后则把游标赋值为1标记终止)
			int ver = 0;
			// 获取后缀名
			String fullName = temp.getName();
			String lastName = fullName.substring(fullName.lastIndexOf(".") + 1);
			//判断文件类型是否为‘log’,暂定文件只有log类型
			if (temp.isFile() && lastName.equals("log")) {

				file = new File(temp.toString());		
				BufferedReader reader1 = null;
				BufferedReader reader2 = null;
				
				//定义目标行和重命名
				String target = "无法识别目标，请检查文本是否在规则范围内";
				String rename = "未定义";

				try {
					
					String tempString = null;
					String factory="other";
					
					//第一次扫描:确定是否为华为厂商
					reader1 = new BufferedReader(new FileReader(file));
					// 一次读入一行，直到读入null并且游标终止时为文件结束，第一次扫描先确定华为厂商，排除'A'和'B'干扰
					while (ver==0 && (tempString = reader1.readLine()) != null) {
						// 华为厂商：判断是否存在关键字：sysname
						if (tempString.contains("<")) {
							target = tempString;
							// 截取所需的文件名
							rename = tempString.substring(tempString.indexOf("<") + 1, tempString.indexOf(">"));
							//游标标记终止，则后面不再往下读取文本
							ver=1;
							//华为厂商
							factory="HuaWei";
						}
						
					}
					reader1.close();
					
					//第二次扫描：先判断如果不是华为厂商才进行其他厂商的扫描
					reader2 = new BufferedReader(new FileReader(file));
					// 一次读入一行，直到读入null并且游标终止时为文件结束，第一次扫描先确定华为厂商，排除'A'和'B'干扰
					while (ver==0 & factory.equals("other") & (tempString = reader2.readLine()) != null) {
						//其他厂商：判断是否有'A'和'B'关键字，如果是华为厂商则不能执行该判断（用游标判断是否已经使用过华为判断规则）
						if(ver!=1&&tempString.contains("A")||tempString.contains("B")) {
							target = tempString;
							// 截取所需的文件名
							rename = tempString.substring(tempString.indexOf(":") + 1, tempString.lastIndexOf("#"));
							//游标标记终止，则后面不再往下读取文本
							ver=1;
						}
						
					}
					reader2.close();
					
										
					// 重命名后的文件
					File file1 = new File("./newFile/" + rename + ".log");
					//重名计数器
					int j = 1;
					//重名标识
					String doubleName = "否";
					//如果重名
					while(file1.exists()) {	
						doubleName="是";
						file1 = new File("./newFile/" + rename +"_"+j+ ".log");
						j++;
					}
					// 重命名文件
					file.renameTo(file1);
					// 输出日志信息
					System.out.println("文件序号：" + num + "\r\n厂商:"+factory+"\r\n原文件:" + fullName.substring(fullName.lastIndexOf("/") + 1)
							+ "\r\n目标行:" + target + "\r\n是否重名:"+doubleName+"\r\n重命名文件:"
							+ file1.getName().substring(file1.getName().lastIndexOf("/") + 1)
							+ "\t\n---------------------------------------------------------------------");
					// 计数器累加
					num++;

				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("代码发生异常，请联系开发人员！");
				} finally {
					if (reader1 != null) {
						try {
							reader1.close();
							reader2.close();
						} catch (IOException e1) {
						}
					}
				}

			}

		}

	}

}
