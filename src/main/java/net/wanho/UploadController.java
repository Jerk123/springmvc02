package net.wanho;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

/**
 * Created by Jerk on 2019/6/3.
 */
@Controller
public class UploadController {
    @RequestMapping("upload")
    @ResponseBody
    public JsonResult upload(MultipartFile file,String desc) {
        System.out.println("desc"+desc);
        System.out.println("file"+file.getOriginalFilename());

        try {
            InputStream inputStream=file.getInputStream();
            OutputStream os=new BufferedOutputStream(new FileOutputStream(new File("E:\\upload\\"
                    + UUID.randomUUID()+".jpg")));
            int len;
            byte[] bytes=new byte[1024];
            while ((len=inputStream.read(bytes))!=-1){
                os.write(bytes);

            }
            os.flush();
            os.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonResult result=new JsonResult(200,"访问成功",file.getOriginalFilename());
        return result;
    }
}

