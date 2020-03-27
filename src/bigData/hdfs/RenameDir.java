package bigData.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author Macx
 * @since 2020/3/25 22:28
 */
public class RenameDir {
    public static void main(String[] args) throws Exception {
        //使用HDFS的API创建目录
        //设置NameNode地址
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://192.168.46.110:9000");//在core-site.xml指定的NameNode地址

        //得到HDFS的文件系统,通知NameNode创建一个目录
        FileSystem fs = FileSystem.get(conf);
        fs.mkdirs(new Path("/huatec02"));
    }
}
