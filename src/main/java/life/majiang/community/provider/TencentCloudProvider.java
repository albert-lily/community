package life.majiang.community.provider;

import com.alibaba.fastjson.JSON;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.http.HttpProtocol;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import life.majiang.community.exception.CustomizeErrorCode;
import life.majiang.community.exception.CustomizeException;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.UUID;

@Service
public class TencentCloudProvider {
    @Value("${tencent.cos.file.secretid}")
    private String secretId;
    @Value("${tencent.cos.file.secretkey}")
    private String secretKey;
    @Value("${tencent.cos.file.bucketname}")
    private String bucketName;
    @Value("${tencent.cos.file.region}")
    private String area;
    @Value("${tencent.cos.file.suffix}")
    private String backStr;
    public String upload(MultipartFile file) {
        // 1 传入获取到的临时密钥 (tmpSecretId, tmpSecretKey, sessionToken)
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        // 2 设置 bucket 的地域
        // clientConfig 中包含了设置 region, https(默认 http), 超时, 代理等 set 方法, 使用可参见源码或者常见问题 Java SDK 部分
        Region region = new Region(area); //COS_REGION 参数：配置成存储桶 bucket 的实际地域，例如 ap-beijing，更多 COS 地域的简称请参见 https://cloud.tencent.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(region);
        // 3 生成 cos 客户端
        clientConfig.setHttpProtocol(HttpProtocol.https);
        COSClient cosClient = new COSClient(cred, clientConfig);
        String bucket = bucketName;
        try{
            // 指定要上传的文件
            InputStream inputStream = file.getInputStream();
            // 指定文件将要存放的存储桶
            // 指定文件上传到 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示将文件 picture.jpg 上传到 folder 路径下
            String key = UUID.randomUUID().toString().replaceAll("-","")+
                    file.getOriginalFilename();
            String dateUrl = new DateTime().toString("yyyy/MM/dd");
            key = dateUrl+"/"+key;
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.setContentLength(file.getSize());
            PutObjectRequest putObjectRequest =
                    new PutObjectRequest(bucket, key, inputStream,objectMetadata);
            PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
            System.out.println(JSON.toJSONString(putObjectResult));
            String url = "https://"+bucket+"."+"cos"+"."+area+"."+backStr+"/"+key;
            return url;
        } catch (Exception clientException) {
            clientException.printStackTrace();
            throw new CustomizeException(CustomizeErrorCode.FILE_UPLOAD_ERROR);
        }
    }
}
