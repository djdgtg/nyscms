package com.retech.nyscms.activemq;

import com.retech.nyscms.entity.FrontEbook;
import com.retech.nyscms.mapper.FrontEbookMapper;
import com.retech.nyscms.mapper.custom.SqlCustomMapper;
import com.retech.nyscms.utils.FastDFSClient;
import com.retech.nyscms.utils.QRCodeUtil;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author qinc
 * @date 2019/3/14
 */
@Component
public class Consumer {

    @Autowired
    private FrontEbookMapper ebookMapper;

    @Autowired
    private FastDFSClient fastDFSClient;

    @Autowired
    private SqlCustomMapper sqlCustomMapper;

    @Value("${fdfs.web-server-url}")
    private String fileserverurl;

    @JmsListener(destination = "genQrcode.queue")
    public void receiveQueue(String seqid) {
        FrontEbook ebook = ebookMapper.selectByPrimaryKey(Integer.valueOf(seqid));
        String content=ebook.getIsbn()+ebook.getName()+ebook.getSeqid();
        try {
            StringBuilder sql=new StringBuilder().append("INSERT INTO front_book_qrcode VALUES ");
            Date date=new Date();
            String format = DateFormatUtils.format(date, "yyyy-MM-dd hh:mm:ss");
            for(int i=1;i<=10;i++){
                BufferedImage image = QRCodeUtil.createImage(content+i,fileserverurl+ebook.getIconurl(), true);
                File file = File.createTempFile(ebook.getName(), ".jpg");
                ImageIO.write(image, "JPG", file);
                String url = fastDFSClient.uploadFile(file);
                sql.append("(null, ")
                        .append(ebook.getSeqid()).append(", '")
                        .append(url).append("', ")
                        .append(0).append(", '")
                        .append(format)
                        .append("', 1 ,1),");
            }
            String sqlstr = sql.toString().substring(0, sql.toString().length() - 1);
            sqlCustomMapper.insertUserMsgs(sqlstr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
