package action.sys;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.system.PrjService;
import util.FileTransfer;

import javax.annotation.Resource;
import java.io.File;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
@Controller
@Scope("prototype")
public class AddPrjAction extends ActionSupport {

    @Resource
    PrjService prjService;
    //service

    @Resource
    FileTransfer fileTransfer;
    //工具类

    private String name;
    private File requestDocument;
    private String requestDocumentFileName;  //需求文档文件名
    private File systemDocument;
    private String systemDocumentFileName;   //系统设计文档文件名
    private String deadline;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getRequestDocument() {
        return requestDocument;
    }

    public void setRequestDocument(File requestDocument) {
        this.requestDocument = requestDocument;
    }

    public String getRequestDocumentFileName() {
        return requestDocumentFileName;
    }

    public void setRequestDocumentFileName(String requestDocumentFileName) {
        this.requestDocumentFileName = requestDocumentFileName;
    }

    public File getSystemDocument() {
        return systemDocument;
    }

    public void setSystemDocument(File systemDocument) {
        this.systemDocument = systemDocument;
    }

    public String getSystemDocumentFileName() {
        return systemDocumentFileName;
    }

    public void setSystemDocumentFileName(String systemDocumentFileName) {
        this.systemDocumentFileName = systemDocumentFileName;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }


    @Override
    public String execute() throws Exception {
        String requestExtension = fileTransfer.getExtension(requestDocumentFileName);//需求文档的拓展名
        String systemExtension = fileTransfer.getExtension(systemDocumentFileName);//系统设计文档的拓展名
        String requestDocumentName = name + "-需求." + requestExtension; //需求文档文件名
        String systemDocumentName = name + "-系统." + systemExtension; //系统设计文档文件名
        String requestAllName = ServletActionContext.getServletContext().getRealPath("/document/request") + File.separator + requestDocumentName;
        //需求文档绝对路径
        String systemAllName = ServletActionContext.getServletContext().getRealPath("/document/system") + File.separator + systemDocumentName;
        //系统设计文档绝对路径
        if(prjService.save(name, requestAllName, systemAllName, deadline)){
            //project保存数据库成功，接着传文件
            fileTransfer.transfer(requestAllName,requestDocument);
            fileTransfer.transfer(systemAllName,systemDocument);
            return SUCCESS;
        }
        return ERROR;
    }
}
