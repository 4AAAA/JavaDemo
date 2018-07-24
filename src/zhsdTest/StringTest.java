package zhsdTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class StringTest {

	public static void main(String[] args) {

		// String aa = "凉山自治州";
		//
		// String bb = aa.substring(0,2);
		//
		// System.out.println("look=>"+bb);

		// HashMap<String, Object> areaMap = new HashMap<String, Object>();
		//
		// areaMap.put("成都市".substring(0, 2), "成都市对象");
		// areaMap.put("凉山xxx自治州".substring(0, 2), "凉山州对象");
		//
		// Object objecta = null;
		//
		// // 客户录入
		// String str = "我凉山州";
		//
		// areaMap.forEach((k, v) -> {
		// System.out.println(k);
		// if (str.indexOf(k) != -1) {
		// System.out.println("包含,返回实体");
		// Object object = areaMap.get(k);
		// System.out.println("aaa->" + object);
		// } else {
		// System.out.println("不包含");
		// }
		// });

		String str = "成都凉山成都州";

		Object findAreaObject = findAreaObject(str);
		System.out.println(findAreaObject);

	}

	/**
	 * 
	 * @param str
	 *            excel传入的区域名称
	 * @return
	 */
	public static Object findAreaObject(String str) {

		// 区域对象
		Object object = null;

		{
			// 对str进行去空格处理
		}

		// 获取数据库区域字典组，并处理成相应的map
		HashMap<String, Object> areaMap = new HashMap<String, Object>();
		areaMap.put("成都市".substring(0, 2), "成都市对象");
		areaMap.put("凉山xxx自治州".substring(0, 2), "凉山州对象");

		for (Entry<String, Object> entry : areaMap.entrySet()) {
			if (str.lastIndexOf(entry.getKey()) != -1) {
				object = entry.getValue();
				System.out.println(object);
			}
		}

		return object;

	}

}
