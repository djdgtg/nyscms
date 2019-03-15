package com.retech.nyscms.service;

import com.retech.nyscms.entity.DbMetadatas;
import com.retech.nyscms.entity.custom.DataLibrarysManageSearchBean;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface PersonalService {

    ActionResult uploadFile(MultipartFile uploadFile);

    ActionResult importFile(MultipartFile file, DataLibrarysManageSearchBean searchBean, HttpServletRequest request);

    void exportModelExcel(List<DbMetadatas> list, HttpServletResponse response, HttpServletRequest request,
                          String tablecname, String type, String databaseName, String mouldId);

    ActionResult updateResByFiledBatch(DataLibrarysManageSearchBean searchBean, String fieldval, String fieldname, HttpServletRequest request);

    boolean checkunique(String columnname, String value, Integer seqid, String databasename);

    HashMap<String, Object> uploadkindeditor(MultipartFile file);

    String getfileServerUrl();

    List<Object[]> platformdataByType(String type);

    ActionResult listfillminusType();

    ActionResult listthemeid();

    ActionResult listuserid();

    ActionResult authorization(DataLibrarysManageSearchBean searchBean, String starttime, String endtime, HttpServletRequest request);

    ActionResult sendMessage(String resIds, HttpServletRequest request);

    ActionResult fankui(String resIds, Integer scorenum);

    List<Object[]> userbaseByType(Integer type);

    List<Object[]> userreadByType(Integer userid, Integer type, String starttime, String endtime);

    List<Object[]> getUserlogin(Integer userid, Integer type);

    List<Object[]> getUserexpend(Integer userid, Integer type);

    ActionResult genQrcode(Integer seqid);

    void exportQrcode(Integer seqid, HttpServletRequest request, HttpServletResponse res);
}
