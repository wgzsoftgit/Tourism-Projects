package ly.base.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.sf.json.JSONObject;

/*@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@RequestMapping("uploadPic")
	public void uploadPic(HttpServletRequest request,String fileName,PrintWriter out){
		//把Request转换多部件请求
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);		
		byte[] fbytes = cm.getBytes();
		//准备图片名称算法
		String newFileName="";
		SimpleDateFormat adf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = adf.format(new Date());
		Random rd = new Random();
		for(int i=0;i<3;i++){
			newFileName = newFileName+rd.nextInt(10);
		}
		//获取文件名
		String sur = cm.getOriginalFilename();		
		//截取文件的扩展名
		String suffix = sur.substring(sur.lastIndexOf("."));
		//创建jersy服务器
		Client client = Client.create();
		
		WebResource resource = client.resource(SSMUtils.PIC_HOST+"/upload/"+newFileName+suffix);
		
		resource.put(String.class, fbytes);
		
		//准备回显图片路径地址
		String fullPath=SSMUtils.PIC_HOST+"/upload/"+newFileName+suffix;
		String relativePath="/upload/"+newFileName+suffix;
		
		String result = "{\"fullPath\":\""+fullPath+"\",\"relativePath\":\""+relativePath+"\"}";
				
		out.print(result);
	}
}	*/
	
	
	
				

	


@Controller                  
@RequestMapping("/upload")
public class UploadController  {
                    
    @RequestMapping(value = "/uploadPic.do", method = RequestMethod.POST)
    public void imgLoad( MultipartFile userPic1, HttpServletRequest request, HttpServletResponse response) {
    	try {
			// 获取图片原始文件名
			String originalFilename = userPic1.getOriginalFilename();
			System.out.println("图片原始文件名"+originalFilename);
		
			// 文件名使用当前时间
			String name = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		
			// 获取上传图片的扩展名(jpg/png/...)
			String extension = FilenameUtils.getExtension(originalFilename);
			
			// 图片上传的相对路径（因为相对路径放到页面上就可以显示图片）
			String path = name + "." + extension;
 System.out.println(path);
			// 图片上传的绝对路径
			String url = request.getSession().getServletContext().getRealPath("upload") +"\\"+ path;
		System.out.println("图片上传的绝对路径"+url);
        		File dir = new File(url);
			if(!dir.exists()) {
			dir.mkdirs();
			}
			
			// 上传图片
			userPic1.transferTo(new File(url));
		
			// 将相对路径写回（json格式）
			JSONObject jsonObject = new JSONObject();
			String src1=request.getContextPath()+"/upload/"+path;
			System.out.println("图片src路径："+src1);
			String video="video="+request.getContextPath()+"/upload/"+path;
			// 将图片上传到本地
			jsonObject.put("path", src1);
			jsonObject.put("paths", url);
			jsonObject.put("video",video);
			// 设置响应数据的类型json  video=
			response.setContentType("application/json; charset=utf-8");
			// 写回
			response.getWriter().write(jsonObject.toString());
 System.out.println("网页返回数据"+jsonObject.toString()+"##################");
		} catch (Exception e) {
			throw new RuntimeException("服务器繁忙，上传图片失败");
		}

   
    	
    	
    	
    
    
    }
  /*  @Controller                  
    @RequestMapping("/upload")
    public class UploadController2  {
                        
        @RequestMapping(value = "/uploadPic.do", method = RequestMethod.POST)
        public String imgLoad( @RequestParam("userPic1")MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {

        	//文件不为空时候才进行上传文件处理
        	if(!file.isEmpty()) {
        		//存放文件的目标路径  路径不够灵活
            	//String targPath="E:/tempkgc/";
        		//通过request获得文件存储路径 WEB-INF下的upload
       //tempDir是临时文件完成后自动清空
      //是在服务器下的webapp->项目名—>upload     特别注意不是工作空间下的
        		String targPath=request.getSession().getServletContext().getRealPath("upload");
            	
        		//处理文件名重复
        		//原始文件名
        		String ofname=file.getOriginalFilename();//java.jpg
        		//文件后缀名
        		String suffix=file.getOriginalFilename().substring(ofname.indexOf(".")-1,ofname.length() );//.jpg
        		//通过uuid+suffix组成文件名   避免文件名重复
        		String norepeatName=UUID.randomUUID().toString()+suffix;
        		
        		
        		//创建文件
            	//File tempFile=new File(targPath+file.getOriginalFilename());
            	File tempFile=new File(targPath+"/"+norepeatName);

            	//文件转换
            	file.transferTo(tempFile);
            	
            	// 将相对路径写回（json格式）
    			JSONObject jsonObject = new JSONObject();
    			String src1=request.getContextPath()+"/upload/"+norepeatName;
    			System.out.println("图片src路径："+src1);
    			String video="video="+request.getContextPath()+"/upload/"+norepeatName;
    			// 将图片上传到本地
    			jsonObject.put("path", src1);
    			jsonObject.put("paths", tempFile);
    			jsonObject.put("video",video);
    			// 设置响应数据的类型json  video=
    			response.setContentType("application/json; charset=utf-8");
    			// 写回
    			response.getWriter().write(jsonObject.toString());
     System.out.println("网页返回数据"+jsonObject.toString()+"##################");
        	}
        	
        	return "success";
        }
        }*/
}



