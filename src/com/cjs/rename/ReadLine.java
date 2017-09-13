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
		int num = 11;
		// 初始化文件
		File file = null;
		// 存放初始化文件的目录（注意不同系统目录格式的差异）
		File dir = new File("/Users/liuyw/Desktop/oldFile");		
		//判断初始化文件目录是否为空
		if(dir.listFiles().length<=0)
			System.out.println("警告:原文件目录为空");		
		//迭代目录所有文件
		for (File temp : dir.listFiles()) {
			// 获取后缀名
			String fullName = temp.getName();
			String lastName = fullName.substring(fullName.lastIndexOf(".") + 1);
			//判断文件类型是否为‘log’,暂定文件只有log类型
			if (temp.isFile() && lastName.equals("log")) {

				file = new File(temp.toString());		
				BufferedReader reader = null;
				
				//定义目标行和重命名
				String target = "无法识别目标，请检查文本是否在规则范围内";
				String rename = "未定义";

				try {
					reader = new BufferedReader(new FileReader(file));
					String tempString = null;
					int line = 1;
					// 一次读入一行，直到读入null为文件结束
					while ((tempString = reader.readLine()) != null) {
						// 判断是否存在关键字：sysname
						if (tempString.contains("sysname")) {
							target = tempString;
							// 截取所需的文件名
							rename = tempString.substring(tempString.indexOf("e") + 1, tempString.length());
						}
						line++;
					}
					reader.close();
					// 重命名后的文件
					File file1 = new File("/Users/liuyw/Desktop/newFile/" + rename + ".log");
					// 重命名文件
					file.renameTo(file1);
					// 输出日志信息
					System.out.println("文件序号：" + num + "\r\n原文件:" + fullName.substring(fullName.lastIndexOf("/") + 1)
							+ "\r\n目标行:" + target + "\r\n重命名文件:"
							+ file1.getName().substring(file1.getName().lastIndexOf("/") + 1)
							+ "\t\n---------------------------------------------------------------------");
					// 计数器累加
					num++;

				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("代码发生异常，请联系开发人员！");
				} finally {
					if (reader != null) {
						try {
							reader.close();
						} catch (IOException e1) {
						}
					}
				}

			}

		}

	}

}
