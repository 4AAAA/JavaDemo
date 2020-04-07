package bigData.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


/**
 * @author Macx
 * @since 2020/4/6 23:04
 */
public class HDFSDemo {
    private static int BUFFER_SIZE = 4096;
    FileSystem fileSystem = null;

    /**
     * 定义一个通用的初始化hdfs文件系统的方法
     *
     * @throws URISyntaxException
     * @throws IOException
     */
    @Before
    public void init() throws URISyntaxException, IOException {
        System.out.println("准备获取hdfs文件系统......");
        //获取hdfs文件系统
        URI uri = new URI("hdfs://192.168.3.100:9000");
        Configuration configuration = new Configuration();
        fileSystem = FileSystem.get(uri, configuration);
        System.out.println("成功获取hdfs文件系统......");
    }

    /**
     * 本地上传至HDFS
     *
     * @throws IOException
     */
    @Test
    public void testUpload() throws IOException {
        System.out.println("准备本地文件上传至HDFS......");
        //指定输出：HDFS
        FSDataOutputStream out = fileSystem.create(new Path("/testHdfs.txt"));
        //指定输入：当前系统
        FileInputStream in = new FileInputStream(new File("/Users/Macx/Desktop/testHdfs.txt"));
        //执行拷贝
        IOUtils.copyBytes(in, out, BUFFER_SIZE);
        System.out.println("成功将本地文件上传至HDFS......");
    }

    /**
     * HDFS文件下载至本地
     *
     * @throws IOException
     */
    @Test
    public void testDownload() throws IOException {
        System.out.println("准备HDFS文件下载至本地......");
        //下载文件
        FSDataInputStream in = fileSystem.open(new Path("/testHdfs.txt"));
        FileOutputStream out = new FileOutputStream(new File("/Users/Macx/Desktop/demo/download/testHdfs.txt"));
        IOUtils.copyBytes(in, out, BUFFER_SIZE);
        System.out.println("成功将HDFS文件下载至本地......");
    }

    /**
     * 文件列表查看
     * @throws IOException
     */
    @Test
    public void listFiles() throws IOException {
        Path path = new Path("/");
        FileStatus[] fileStatuses = fileSystem.listStatus(path);
        System.out.println("展示HDFS目录的所有文件:");
        for (int i = 0; i < fileStatuses.length; i++) {
            System.out.println(fileStatuses[i].getPath().toString());
        }
    }

    /**
     * 文件删除
     *
     * @throws IOException
     */
    @Test
    public void deleteFile() throws IOException {
        Path path = new Path("/testHdfs.txt");
        boolean isExists = fileSystem.exists(path);
        if (isExists) {
            boolean result = fileSystem.delete(path, true);
            System.out.println("HDFS的文件是否已经删除：" + result);
        } else {
            System.out.println("HDFS的文件是否存在：" + isExists);
        }
    }

}
