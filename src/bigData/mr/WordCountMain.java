package bigData.mr;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCountMain {

	public static void main(String[] args) throws Exception {
		//创建一个job = map + reduce
		Configuration conf = new Configuration();
		
		//创建一个Job
		Job job = Job.getInstance(conf);
		//指定任务的入口
		job.setJarByClass(WordCountMain.class);

		//ָ指定job的mapper
		job.setMapperClass(WordCountMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(LongWritable.class);
		
		//ָ指定job的reducer
		job.setReducerClass(WordCountReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(LongWritable.class);

		/**
		 * 这些是Hadoop的预定义函数，先把输入的数据处理成<key value>的形式
		 */

		//ָ指定任务的输入和输出
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		/**
		 * TextInputFormat是FileInputFormat的子类，会把每行记录数据生成一条记录，每条记录生成<key value>的形式
		 */
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		/**
		 * TextOutputFormat 会和输入一样，将每条记录以一行的形式存入文本文件，它的键和值可以是任意形式的，因为程序内部
		 * 会调用toString()方法将键和值转换为String类型再输出
		 */

		
		//提交任务
		job.waitForCompletion(true);
	}

}














